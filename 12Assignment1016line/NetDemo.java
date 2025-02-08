import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;
import java.text.*;

public class NetDemo extends Panel implements KeyListener
{
 static Frame myFrame;
 TextField tf;
 TextArea ta;
 Panel p1,p2,p3;
 Scrollbar sb1,sb2;
 String currentPath=System.getProperty("user.dir");
 String prompt=">",Temp="",drive_Name="";
 int commandNum=0,tempCommand=0;
 Object val;
 ArrayList ll=new ArrayList();
 
 String currentContent="",path="";
 boolean editOn;
 
 public NetDemo()
 {
  ta=new TextArea(25,75);
  tf=new TextField(75);
  p1=new Panel();
  p1.setBackground(Color.lightGray);
  p2=new Panel();
  p2.setBackground(Color.lightGray);
  
  setLayout(new BorderLayout());
  p1.add(ta,BorderLayout.NORTH);
  add(p1,BorderLayout.NORTH);
  p2.add(tf,BorderLayout.NORTH);
  add(p2,BorderLayout.SOUTH);
 
 Font f=new Font("Monospace4d",Font.PLAIN,15);
 ta.setFont(f);
 tf.setFont(f);
 ta.setBackground(Color.white);
 ta.setBackground(Color.black);
 tf.setBackground(Color.white);
 tf.setForeground(Color.black);
 
 ta.append("Title :   Molecule Virtual OS\n");
 
 
 ta.append(currentPath+prompt);
 ta.setEditable(false);
 
 tf.addKeyListener(this);
 requestFocus();
 tf.requestFocus();
 }
   
   void p(String s){ta.append(s);}
   public void keyTyped(KeyEvent ke) {};
   
   public void keyReleased(KeyEvent ke) {};
   public void keyPressed(KeyEvent ke) {
	   if(editOn==false) commandControl(ke);
	   if(editOn==true) edit(ke);
   }
   
 ///////////////////////////////////////////////
 ///////////////////////EDIT MODE //////////////
 ///////////////////////////////////////////////
 protected void edit(KeyEvent ke)
 {
	 editOn=true;
	 char c=ke.getKeyChar();
	 String commandEnter=tf.getText();
	 StringTokenizer tokenizer=new StringTokenizer(commandEnter);
	 
	 if(c=='\n'){
		 
		 if(commandEnter.equals("exit"))
		 {
			 ta.setText(currentContent);
			 ta.setEditable(false);
			 tf.setText("");
			 
			 editOn=false;
			 ta.append(currentPath+prompt);
			 myFrame.setTitle("Molecule (NetDemo Consol)-type 'help' or'?' for Help");
		 }
		 else if(commandEnter.startsWith("save") || commandEnter.startsWith("save"))
		 {
			 String token=tokenizer.nextToken();
			 String taContent=ta.getText();
			 char opchar;
			 int count,countLimit=taContent.length();
			 
			 while(tokenizer.hasMoreTokens())
			 {
				 try{
					 token=tokenizer.nextToken();
					 FileOutputStream fout=new FileOutputStream(drive_Name+currentPath+"/"+token);
				  
				  for(count=0;count<countLimit;count++)
				  {
					  opchar=taContent.charAt(count);
					  fout.write((int)opchar);
				  }
				  fout.close();
		        }catch(Exception e)
				{
					ta.append("Enter:Can nit save the progream"+token+"\n");
				}
			 }
			 tf.setText("");
			 tf.requestFocus();
		 }
		 else{
			 tf.setText("");
			 ta.requestFocus();
		 }
	    }
	  }
///////////////////////////////////////////////////////////
///////////////////// COMMAND MODE/////////////////////////
///////////////////////////////////////////////////////////
protected void commandControl(KeyEvent ke)
{
	editOn=false;
	char c=ke.getKeyChar();
	int key=ke.getKeyCode();
	
	if(key==KeyEvent.VK_UP)
	{
		tempCommand=tempCommand-1;
		try{
			val=ll.get(tempCommand);
			String commandSel=(String)val;
			tf.setText("");
			tf.setText(commandSel);
		}catch(Exception e){}
	}
	
	if(key==KeyEvent.VK_DOWN)
	{
		tempCommand=tempCommand+1;
		try{
			val=ll.get(tempCommand);
			String commandSel=(String)val;
			tf.setText("");
			tf.setText(commandSel);
		}catch(Exception e){}
	}
	
	if(c=='\n')
	{
		String ta_Address="",command="";
		String commandEnter=tf.getText();
		commandEnter=commandEnter.trim();
		int i,commandMode;
		
		if(!commandEnter.equals(""))
		{
			ll.add(commandEnter);
			commandNum=commandNum+1;
			tempCommand=tempCommand+1;
			//System.out.println(ll+" "+commandNum);
		}
		try
		{
			String tmp1=currentPath+"/"+commandEnter;
			String tmp2=tmp1.replace('\\','/');
			StringTokenizer st1=new StringTokenizer(tmp2);
			String tmp3=st1.nextToken();
			String tmp4=st1.nextToken();
			tmp2=tmp3+tmp4;
			//System.out.println(tmp2);
		}catch(Exception e){}
		
		tf.setText("");
		StringTokenizer tokenizer=new StringTokenizer(commandEnter);
		
////////////////////// IP ////////////////////
    if(commandEnter.startsWith("ip") || commandEnter.startsWith("ip"))
    {
		int ServerError=0;
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.setEditable(false);
		String token=tokenizer.nextToken();
		
		while(tokenizer.hasMoreTokens())
		{
			token=tokenizer.nextToken();
			try
			{
				InetAddress SW[]=InetAddress.getAllByName(token);
				for(i=0;i<SW.length;i++)
				ta_Address=ta_Address+SW[i]+"\n";
				ta.setEditable(true);
				ta.append(ta_Address+"\n");
				ta.setEditable(false);
			}catch(Exception e)
			{
				ServerError=1;
				String cannotFindServer="";
				cannotFindServer=token;
				ta.append("Erro: Can't find server"+cannotFindServer+"\n");
			}
		 }
		 if(ServerError==1)
		 {
			 ta.append(currentPath+prompt);
			 ta.requestFocus();
		 }
	}
	
/////////////////////// URL INFORMATION ////////////
	if(commandEnter.startsWith("urlinfo") || commandEnter.startsWith("urlinfo"))
	{
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.setEditable(false);
		
		String token=tokenizer.nextToken();
		
		while(tokenizer.hasMoreTokens())
		{
			token=tokenizer.nextToken();
			try
			{
				URL hp=new URL(token);
				URLConnection hpCon=hp.openConnection();
				ta.append(""+token+"available data:\n");
				ta.append("Date:"+new Date(hpCon.getDate())+"\n");
				ta.append("Last Modified:"+new Date(hpCon.getLastModified())+"\n");
				
				ta.setEditable(true);
				ta.append(ta_Address+"\n\n");
				ta.setEditable(false);				
			}catch(Exception e)
			{
				String connotFindServer="";
				connotFindServer=token;
				ta.append("Error: Can't find server"+connotFindServer+"\n");
				ta.append("Usage: urlinfo http://"+connotFindServer+"\n");
			}
		}
		
	  ta.append(currentPath+prompt);
	  tf.requestFocus();
	}
	
///////////////////// RUN ////////////////////////////
    else if(commandEnter.startsWith("Run") || commandEnter.startsWith("Run"))
  {
	int runError=0;
	ta.setEditable(true);
	ta.append(commandEnter+"\n");
	ta.setEditable(false);
	String token=tokenizer.nextToken();
	String ta_Run="";
	
	while(tokenizer.hasMoreTokens())
	{
		token=tokenizer.nextToken();
		Runtime r=Runtime.getRuntime();
		Process p=null;
		try
		{
			p=r.exec(token);
			ta_Run=ta_Run+token+"\n";
			ta.setEditable(true);
		}catch(Exception e)
		{
			String connotRunFile="";
			connotRunFile=token;
			ta.append("Enter : con't run program"+connotRunFile+"\n");
		}
	}
	ta.append("The file(s) started re:\n"+ta_Run+"\n");
	ta.append(currentPath+prompt);
	ta.setEditable(false);
  }
  
  /////////////////////// WHOIS //////////////////
   else if(commandEnter.startsWith("whois") || commandEnter.startsWith("whois"))
   {
	   int whois=0,ch;
	   ta.setEditable(true);
	   ta.append(commandEnter+"\n");
	   ta.setEditable(false);
	   String token=tokenizer.nextToken();
	   String ta_Whois="", Whois="";
	   
	   while(tokenizer.hasMoreTokens())
	   {
		   token=tokenizer.nextToken();
		   try
		   {
			  Socket s=new Socket("internic.net",43);
              InputStream in=s.getInputStream();
			  OutputStream out=s.getOutputStream();
			  Whois=token+"\n";
			  byte buf[]=Whois.getBytes();
			  out.write(buf);
			  while((ch=in.read())!=-1)
			  {
				  ta_Whois=ta_Whois+(char)ch;
			  }
			  ta.append(ta_Whois);
			  s.close();
		   }catch(Exception e)
		   {
			   String cannotFindWhois="";
			   cannotFindWhois=token;
			   ta.append("Erroe: Can't find server"+cannotFindWhois+"\n");
		   }
	   }
	   //s.close();
	   ta.append(currentPath+prompt);
	   ta.setEditable(false);
   }
   
   ////////////////////// FIND FIlE ///////////////////
   boolean findFile;
   ta.setEditable(true);
   ta.append(commandEnter+"\n");
   String token=tokenizer.nextToken();
   String ta_FileExists="",ta_FileDoesNotExist="";
   
   while(tokenizer.hasMoreTokens())
   {
	   token=tokenizer.nextToken();
	   try{
		   File isHere=new File(token);
		   findFile=isHere.exists();
		   
		   if(findFile==true)
		   {
			   ta_FileExists=ta_FileExists+token+"\n";
		   }
		   else{
			  ta_FileDoesNotExist=ta_FileDoesNotExist+token+"\n"; 
		   }
	   }catch(Exception e)
	   {
		   ta.append("Error : Can't execute command 'find'\n");
	   }
     }
	   ta.append("The file(s) exist(s):\n");
	   ta.append(ta_FileExists);
	   ta.append("The file(s) do(es) not exist(s):\n");
       ta.append(ta_FileDoesNotExist+"\n");
       ta.append(currentPath+prompt);
       ta.setEditable(false);
	}
	
	///////////////////// BLANK VIDEO ////////////

	else if(commandEnter.equalsIgnoreCase("bv")){
		ta.setBackground(Color.black);
	
	 	tf.setBackground(Color.black);
	 	ta.setBackground(Color.lightGray);
	 	tf.setBackground(Color.lightGray);
	 	ta.setEditable(true);
	 	ta.append(commandEnter+"\n");
	// 	ta.append(currentPath+prompt);
	// 	ta.setEditable(false);
	 }
	
/////////////////// NORMAL VIDEO //////////////
  else if(commandEnter.equalsIgnoreCase("nv"))
  {
        ta.setBackground(Color.white);
		tf.setBackground(Color.white);
		ta.setBackground(Color.black);
		tf.setBackground(Color.black);
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.append(commandEnter+prompt);
		ta.setEditable(false);
  }
  
  /////////////////////// ORANGE VIDEO /////////
    else if(commandEnter.equalsIgnorCase("ov"))
    {
        ta.setBackground(Color.black);
		tf.setBackground(Color.black);
		ta.setBackground(Color.orange);
		tf.setBackground(Color.orange);
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.append(commandEnter+prompt);
		ta.setEditable(false);
  }
  
  ///////////////////// YELLOW VIDEO ////////////
   else if(commandEnter.equalsIgnorCase("yv"))
    {
        ta.setBackground(Color.black);
		tf.setBackground(Color.black);
		ta.setBackground(Color.yellow);
		tf.setBackground(Color.yellow);
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.append(commandEnter+prompt);
		ta.setEditable(false);
     }
////////////////////////// GREEN VIDEO ///////////
      else if(commandEnter.equalsIgnorCase("gv"))
    {
        ta.setBackground(Color.black);
		tf.setBackground(Color.black);
		ta.setBackground(Color.green);
		tf.setBackground(Color.green);
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.append(commandEnter+prompt);
		ta.setEditable(false);
     }
	 
/////////////// DATE  ////////////////
      else if(commandEnter.equalsIgnorCase("Date"))
    {
	
		Date date=new Date();
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		ta.append("current date:"+date+"\n\n");
		ta.append(commandEnter+prompt);
		ta.setEditable(false);
		tf.requestFocus();
     }	 
	 
///////////////////  CLS ////////////////
     else if(commandEnter.equalsIgnorCase("cls"))
    {
        ta.setText("");
		ta.append(commandEnter+prompt);
		tf.requestFocus();
     } 
	 
//////////////////// DIRECTORY /////////////////////
  else if(commandEnter.startWith("dir"))
  {
	  int j=0;
	  ta.setEditable(true);
	  ta.append(commandEnter+"\n");

	  try{
		  String token=tokenizer.nextToken();
		  token=tokenizer.nextToken();
		  File dir=new File(token);
          Temp=dir.getPath();
          ta.append("Directory :"+dir.getPath()+"\n");
          p(dir.exists()?"":"The directory does not exist\n");
          String[] fileNames;
		  fileNames=dir.list();
		  
		  for(j=0;j<=fileNames.length;j++)
		  {
			  int fileSize=fileNames[j].length();
			  ta.append(fileNames[j]+","+"("+fileSize+"bytes)\n");
		  }
	  }catch(Exception e){}
	  
	  ta.append("\nTotal File:"+j);
	  ta.append("\n");
	  ta.append(currentPath+prompt);
	  ta.setEditable(false);
    }
	
////////////////////////////////////////////////////////////
    else if(commandEnter.equalsIgnorCase("dir"))
     {
        ta.setEditable(true);
		ta.append(commandEnter+"\n");
		
		int j=0;
		try{
			File dir=new File(drive_Name+currentPath);
			ta.append("\nFile\n-----\n");
			
			String[] fileNames;
			fileNames=dir.list();
			
			for(j=0;j<=fileNames.length;j++)
			{
				//File f=new File(drive_Name+currentPath+fileNames[j]);
				//System.out.println(currentPath);
				File f=new File(fileNames[j]);
				//if(f.isDirectory()){
				//ta.append(fileNames[j]+",(directory)\n");
				//	int fileSize=fileNames[j].length();
				//long fileSize=f.length();
				//long modTime=f.lastModified();
				//ta.append(fileNames[j]+","+"("+fileSize+"bytes)\n);
				ta.append(fileNames[j]+"\n");
				//if(fileSize==0)ta.append(fileNames[j]+","+"(dir)\n);
				//}
				//else{
					//ta.append(fileNames[j]+",(file)\n);
				//}
	         }
         } 
	   }catch(Exception e){}
	     ta.append("\nTotal File:"+j);
	     ta.append("\n");
	     ta.append(currentPath+prompt);
	      ta.setEditable(false);
		  
     }
	 
////////////////// CHANGE DIRECTORY ////////////////
  	 else if(commandEnter.starstWith("cd"))
     {
		String ta_List="",currentDir="";
		ta.setEditable(true);
	    ta.append(commandEnter+"\n");
	     try{
			 String token=tokenizer.nextToken();
			 token=tokenizer.nextToken();
			 
			 File cd=new File(drive_Name+currentPath+"/"+token);
			 path=drive_Name+currentPath+"/"+token;
			 if(cd.exists()==false) ta.append("Error: File do not exist\n");
		 }catch(Exception e)
		 {
			 ta.append("Erroe: Can't execute command 'cd'\n");
		 }
		 
	     ta.append("\n");
	     ta.append(currentPath+prompt);
	     ta.setEditable(false);
		 tf.requestFocus();
		  
     }
	 
///////////////////////////////////////////////////////////
else if(commandEnter.equalsIgnoreCase("cd"))ta.append(commandEnter+"\n"+System.
                    getProperty("user.dir")+"\n\n"+currentContent+prompt);
			
/////////////////////////////////////////////////////////////////
  	else if(commandEnter.equalsIgnoreCase("cd.."))
	{
		String ta_List="",currentDir="",rootDir="";
		ta.setEditable(true);
		ta.append(commandEnter+"\n");
		try{
			Eile dir=new File(currentPath);
			if(dir.exists()==false)ta.append("Error: can't change directory\n");
			currentPath=dir.getPath();
			rootDir=dir.getPath();
			if(currentPath==null) {currentPath=rootDir;}
			
		}catch(Exception e)
		{
			ta.append("Error: Can't execute command 'cd'\n");
		}
	     ta.append("\n");
	     ta.append(currentPath+prompt);
	     ta.setEditable(false);
		 tf.requestFocus();
	}
	
////////////////////// SHOW FILE ///////////////////
	 else if(commandEnter.startsWith("Whois") || commandEnter.startsWith("Whois"))
       {
	   int ic;
	   ta.setEditable(true);
       ta.append(commandEnter+"\n");
       String token=tokenizer.nextToken();
	   String fileContent="";
	   
	   while(tokenizer.hasMoreTokens())
	   {
		   token=tokenizer.nextToken();
		   
		   try{
			   FileInputStream fin=new FileImageInputStream(drive_Name+currentPath+"/"+token);
			   
			   do{
				   ic=fin.read();
				   if(ic!=-1)fileContent=fileContent+(char)ic;
			   }
			   while(ic!=-1);
				   fin.close();
			   ta.append(fileContent);
			   fileContent="";
		   }catch(Exception e)
		   {
			   String connotShowFile="";
			   connotShowFile=token;
			   ta.append("Error: Can't show file"+connotShowFile+"\n");
		   }
	      }
	   
	     ta.append("\n");
	     ta.append(currentPath+prompt);
	     ta.setEditable(false);
	   }

/////////////////////////// COPY FILE //////////////////
     else if(commandEnter.startsWith("copy") || commandEnter.startsWith("copy"))
       {
	      int ic;
		  ta.setEditable(true);
		  ta.append(commandEnter+"\n");
		  
		  String fileContent="";
		  FileInputStream fin;
		  FileOutputStream fout;
		  
		  try{
			   String token=tokenizer.nextToken();
			   token=tokenizer.nextToken();
			   fin=new FileInputStream(drive_Name+currentPath+"/"+token);
			   
			    token=tokenizer.nextToken();
			     fout=new FileOutputStream(drive_Name+currentPath+"/"+token);
		     do{
				 ic=fin.read();
                  if(ic!=-1) fout.write(ic);
			 }
				while(ic=-1);
				fin.close();
				fout.close();
		  }catch(Exception e){
			  ta.append("Error: Can't execute 'copy' command\n");
		  }	
		 ta.append("\n");
	     ta.append(currentPath+prompt);
	     ta.setEditable(false);
	   }

////////////////////// RENAME FILE ///////////////////////
     else if(commandEnter.startWith("rename") || commandEnter.startWith("rename"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");	
         
           try{
				String token=tokenizer.nextT();
				token=tokenizer.nextToken();
				File oldFile=new File(drive_Name+currentPath+"/"+token);
				if(oldFile.exists()==false) ta.append("Error: File "+oldFile+"does'nt exist\n");
				
				token=tokenizer.nextToken();
				Fole newFile=new File(drive_Name+currentPath+"/"+token);
				oldFile.renameTo(newFile);
		   }catch(Exception e)
		   {
			   ta.append("Error: Can't execute 'rename' command\n");
		   }
	     ta.append("\n");
	     ta.append(currentPath+prompt);
	     ta.setEditable(false);
	   }
	   
////////////////////////////// DELETE FILE //////////////////	   
      else if(commandEnter.startsWith("kill") || commandEnter.startsWith("kill"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  String token=tokenizer.nextToken();
		  
		  while(tokenizer.haeMoreTokens())
		  {
			  try{
				  token=tokenizer.nextToken();
				  File killFile=new File(drive_Name+currentPath+"/"+token);

                   if(killFile.exists()==false) ta.append("Error: File "+killFile+"does'nt exist\n");

					killFile.delete();
			  }catch(Exception e)
			  {
				   ta.append("Error: Can't execute 'rename' command\n");
		       }
		  }
	             ta.append("\n");
	             ta.append(currentPath+prompt);
	             ta.setEditable(false);
	   }
	   
//////////////////////////// MAKE DIRECTORY ////////////////////
	 else if(commandEnter.startWith("md") || commandEnter.startWith("md"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  
		  while(tokenizer.haeMoreTokens())
		  {
			  try{
				  String token=tokenizer.nextToken();
				  token=tokenizer.nextToken();
				  File md=new File(drive_Name+currentPath+"/"+token);
				  md.mkdir();
				  
			  }catch(Exception e)
			  {
				   ta.append("Error: Can't execute 'md' command\n");
		       }
		   }
	          ta.append("\n");
	          ta.append(currentPath+prompt);
	          ta.setEditable(false);
	   }
	   
/////////////////////////// EDIT /////////////////////////////
    else if(commandEnter.startsWith("edit") || commandEnter.startsWith("edit"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  currentContent=ta.getText();
		  int ic;
		  String fileContent="",currentFile="";
		  
		  String token=tokenizer.nextToken();
		  ta.setText();
			  try{
				  token=tokenizer.nextToken();
				  currentFile=token;
				  
				  File FileInputStream=new FileInputStream(drive_Name+currentPath+"/"+token);

                   do{
					   ic=fin.read();
					   if (ic!=-1) fileContent=fileContent+(char)ic;
				     }while(ic!=-1);
					 fin.close();
					 ta.append(fileContent);
					 
			  }catch(Exception e) {}
			  //ta.setText("");
			  editOn=true;
			  myFrame.setTitle("NetDemo Console - Edit Mode(Type 'exit' to quit) - "+currentFile);
			  ta.requestFocus();
	   }
	   
///////////////////////////////////// LOCAL DATE //////////////////////
	  else if(commandEnter.startsWith("local") || commandEnter.startsWith("local"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
	       
		   String token=tokenizer.nextToken();
		   Date date=new Date();
		   DateFormate df;
		   Local Country=Local.US;
		   
		   try{
			   token=token.nextToken();
			   
			   if(token.equals("-us"))
			   {
				   ta.append("United States:\n");
				   country=Local.US;
			   }
			   if(toke.equals("-uk"))
			   {
				  ta.append("United kinfdom:\n");
				   country=Local.UK; 
			   }
			   if(toke.equals("-jp"))
			   {
				  ta.append("Japan:\n");
				   country=Local.JAPAN; 
			   }
			   if(toke.equals("-kr"))
			   {
				  ta.append("Korea:\n");
				   country=Local.KOREA; 
			   }
			   if(toke.equals("-fr"))
			   {
				  ta.append("France:\n");
				   country=Local.FRANCE; 
			   }
			   if(toke.equals("-gr"))
			   {
				  ta.append("Germany:\n");
				   country=Local.GERMANY; 
			   }
			   if(toke.equals("-it"))
			   {
				  ta.append("Italy:\n");
    			  country=Local.ITALY;
			   }
			   if(toke.equals("-ca"))
			   {
				  ta.append("canada:\n");
				   country=Local.CANADA; 
			   }
			   if(toke.equals("-ch"))
			   {
				  ta.append("China:\n");
				   country=Local.CHINA; 
			   }
			   if(toke.equals("-tw"))
			   {
				  ta.append("Taiwan:\n");
				   country=Local.TAIWAN; 
			   }
	   	   
		   df=DateFormat.getTimeInstance(DateFormat.FULL,country);
		   ta.append("Time: "+df.getTimeInstance(date)+"\n");
	       df=DateFormat.getTimeInstance(DateFormat.FULL,country);
		   ta.append("Date: "+df.getTimeInstance(date)+"\n");
		 
		 }catch(Exception e)
		 {
			 ta.append("Usage: local -us (United state)\n");
			 ta.append("       local -uk (United Kingdom)\n");
			 ta.append("       local -gr (Germany )\n");
			 ta.append("       local -fr (France )\n");
			 ta.append("       local -ca (Canada )\n");
			 ta.append("       local -it (Italy )\n");
			 ta.append("       local -ch (China )\n");
			 ta.append("       local -kr (Korea )\n");
			 ta.append("       local -jp (Japan )\n");
		 }
		 
		 	   ta.append("\n");
	          ta.append(currentPath+prompt);
	          ta.setEditable(false);
	   }
	   
//////////////////////////	SORT ////////////////////
     else if(commandEnter.startsWith("edit") || commandEnter.startsWith("edit"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  
		  String token=tokenizer.nextToken();
		  TreeSet ts=new TreeSet();
		  
		  while(tokenizer.hasMoreTokens())
		  {
			  token=tokenizer.nextToken();
			  
			  try{
				  ts.add(token);
			  }catch(Exception e)
			  {
				  t.append("Error : Can't execute command 'sort'\n");
			  }
		  }
		  ta.append("The sorted lisr:\n");
		   ta.append(ts+"\n");
	       ta.append(currentPath+prompt);
	       ta.setEditable(false);
	   }
      		  
/////////////////////////////////CHECK MEMORY ///////////////
     else if(commandEnter.equalsIgnorCase("memcheck"))
	 {
	       Runitme r=Runtime.getRunTime();
           long mem1;
           ta.setEditable(true);
		   ta.append(commandEnter+"\n");
		   ta.append("Total Memory: "+r.totalMemory()+"bytes"+"\n");
		   ta.append("Initial free Memory: "+r.freeMemory()+"bytes"+"\n");
		   r.gc();
		   mem1=r.freeMemory();
		   ta.append("Free Memory after Garbage Collection: "+mem1+"bytes\n\n");
		   ta.append(currentPath+prompt);
		   ta.append(false);
		   
	 }
	 
///////////////////////// OS INFORMATION ////////////////////////////
   	  else if(commandEnter.equalsIgnorCase("memcheck"))
	  {
		  ta.setEditable(true);
          ta.append(commandEnter+"\n");
          String os_arch="",os_name="",os_version="",user_Name="",user_Home="";

      os_arch=System.getProperty("os.arch");		  
      os_name=System.getProperty("os.name");			  
      os_version=System.getProperty("os.version");
      os_Name=System.getProperty("user.name");
      os_Home=System.getProperty("usre.home");

      ta.append("OS Architecture:"+os_arch+"type\n");
	  ta.append("OS Nmae:"+os_name);
	  if(os_name.equals("Window 95"))ta.append("(Window 98/ME)\n");
      ta.append("OS Version:"+os_version+"\n");
      ta.append("OS Registered to:"+os_Name+"\n");
      ta.append("OS Installation:"+os_Home+"\n\n");
      ta.append(currentPath+prompt);
      ta.setEditable(false);
	  }
	  
//////////////////// QUIT /////////////////////////////
 	  else if(commandEnter.equalsIgnorCase("quit"))
	  {
		  System.exit(0);
	  }
	  
//////////////////////////////////////////////////
    else if(commandEnter.equals(""))
	  {
		  ta.append("\n");
		  ta.append(currentPath+prompt);
		  tf.requestFocus();
		  
	  }
	  
///////////////////// PROMPT ///////////////////////////
	else if(commandEnter.startsWith("prompt") || commandEnter.startsWith("prompt"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  try{
			  String token=tokenizer.nextToken();
			  token=tokenizer.nextToken();
			  prompt=token;
			  
		  }catch(Exception e){
			ta.append("Error: Perameter missing in 'prompt'\nUsage:prompt anyword\n");  
		  }
		  ta.append(currentPath+prompt);
		  ta.setEditable(false);
	   }
	   
///////////////////////// HELP ///////////////////////////////
    else if(commandEnter.startsWith("help") || commandEnter.startsWith("hepl"))
       {
		   
	      ta.setEditable(true);
          ta.append(commandEnter+"\n");
		  ta.append("-------|----------------------------|------------\n");
		  ta.append(" COMMAND  | MEANING                   | EXAMPLE\n");
		  ta.append("-------|----------------------------|-----------\n");
		  ta.append("ip   |Internet Protocol         | ip yahoo.com hotmail.com\n");
		  ta.append("run  |Run Program               |run calc notepad word prog\n");
		  ta.append("date  |Show Date                | gate\n");
		  ta.append("cls   | clear screen            | cls\n");
		  ta.append("cd    | Change directory        | cd Program\n");
		  ta.append("cpoy   |copy file               | copy readme.txt newreadme.txt\n");
		  ta.append("dir    | show Directory         | dir\n");
		  ta.append("memcheck | Checjck Memory       | memcheck\n");
		  ta.append("prompt  | Changes Promt sign     | prompt\n");
		  ta.append("urlinfo | Gives URL Information   | urlinfo http://www.yahoo.com\n");
		  ta.append("sort     | Sorts given data       | sort bad perfect great\n");
		  ta.append("edit      | Goes to Edit mode     |edit fileName(optional)\n");
		  ta.append("find      |Finds file             |find Program dbm hello.txt\n");
		  ta.append("kill      | Delete file           | kill file1.txt file2.txt\n");
		  ta.append("save      |Save file inedit b mode  |save file1 file 2 file3\n");
		  ta.append("lacal      | Show country Time & Date  | local\n");
		  ta.append("nv      | Normal video             | nv\n");
		  ta.append("bv      | Black video               | bv\n");
		  ta.append("gv      | Green video               | gv\n");
		  ta.append("gv      | Yellow video              | yv\n");
		  ta.append("rename  | Rename files              | ren oldName.txt newName.txt\n");
		  ta.append("md      | Create new Dictionary     | md newDirectory\n\n");
		  ta.append("show      |Shows file Content       | show readme.txt\n");
		  ta.append("osinfo      |Os Information          | osinfo\n");
		  ta.append(" exit      | Exit fromn Edit Mode    | exit\n");
		  ta.append("help      | Show help information    | help\n");
		  ta.append("?      | Shows help information      |?\n");
		  ta.append("whois      | Gives information of site | whois internic.net dotcom.com\n");
		  ta.append(" Quit      | Quits NetDemo / Edit mode | quit\n\n");
          
          ta.append(currentPath+prompt);
          tf.requestFocus();
	   }

/////////////////////// ERROR ///////////////////////////
      else
	     {
		   ta.setEditable(true);
		   ta.append(commandEnter+"\n");
		   String temp=currentPath+"/"+commandEnter;
		   String temp2=temp.replace('\\');
		   StringTokenizer st=new StringTokenizer(temp2);
			String temp3=st.nextToken();
			String temp4=st.nextToken();
			temp2=temp3+temp4;
			//System.out.println(temp2);
			try{
				Runtime r=Runtime.getRuntime();
				Process p=null;
				
				p=r.exec(temp2);
			}catch(Exception e)
			{
				ta.append("Error: Illegel command call\n\n");
			}
			ta.append(currentPath+prompt);
			ta.setEditable(false);
			tf.requestFocus();
      	  }		  
       }
	  
	  
public static void main(String args[])throws Exception
 {
	myFrame=new Frame("Molecule (NetDemo Console)- Type 'help' or '?' for help");
	NetDemo nd=new NetDemo();
	myFrame.add(nd);
	myFrame.setSize(600,400);
	myFrame.setLocation(200,100);
	myFrame.pack();
	myFrame.setResizable(false);
	myframe.show();
	
	myframe.addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
	});
}	  
		  	  
}
