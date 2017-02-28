/**
 * @author (NAVROOP SINGH BAJWA)
 * @version (2012)
 */
import  java.io.*;
import java.util.*;
public class AirportReservatiomProgram{
public static void main(String args[])throws IOException{
String ch1;
do{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("                                                 WELCOME TO BAJWA AIRPORT                                             ");                  
Date d = new Date();
System.out.println("\nToday Date is "+d+"\n");
System.out.println("---------------------------------------------------------What type of reservation do you want in your fligt?------------------------------------------------------------------------- "+"\n\n");
System.out.println( "1.Domestic Flights\n2.International Flights\n3.Notice\nEnter any Option 1/2/3");
try{
int ch2=Integer.parseInt(input.readLine());
int ch25;
for(ch25=0;ch2>3;ch25=ch25){
System.out.println("You had entered wrong option - "+ch2+".");
System.out.println("Enter again any option.");
ch2=Integer.parseInt(input.readLine());}
for(ch25=0;ch2<1;ch25=ch25){
System.out.println("You had entered wrong option - "+ch2+".");
System.out.println("Enter again any option.");
ch2=Integer.parseInt(input.readLine());}
System.out.println("\n"+"Notice---Due to Chritmas all Flights before Chritmas are booked. "+"\n\n");
switch(ch2){
case 1:
domstFlig();
break;
case 2:
intrFlig();
break;
case 3:
System.out.println("* Notice  --> You Are Instructed to reach Departure Section of Airport at 11:30AM on your given Date.");
System.out.println("The Ticket printed in this Prog is just copy of ticket.\nThe Original Ticket will be given to You at Airport.");
System.out.println("If you want to Cancel Your ticket donot reach airport and Your Amount will be refunded after 1week to you after deducting Rs.1000.");
break;
}
}catch(Exception e){
System.out.println("\n\n"+"Error in Data entry."+"\n"+"Exception :-"+e);
}
System.out.println("\n\n"+"If you want to continue reserving more tickets then press y or if you donot want to continue press any other key");
ch1=input.readLine();}
while(ch1.equalsIgnoreCase("y"));
System.out.println("Thanks for reserving tickets at FRIENDS' AIRPORT SERVICE.Hope you visit again. ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}





static void  domstFlig()throws IOException{
String ch6="0",intr="domst";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name.");
String ch4 =input.readLine();
do{try{
System.out.println("\n\n"+"When do you want your Fligt?"+"\n"+"NOTE----Enter only month number in which you want to reserve your Flight in 2013."+"\n");
int ch7 =Integer.parseInt(input.readLine()); 
int ch24;
for(ch24=0;ch7>12;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong month number-"+ch7);
System.out.println("Enter again month number");
ch7=Integer.parseInt(input.readLine());}
for(ch24=0;ch7<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong month number-"+ch7);
System.out.println("Enter again month number");
ch7=Integer.parseInt(input.readLine());}
String ch22="0";
switch(ch7){
case 1:
String ch10="January";
ch22=ch10;
break;
case 2:
String ch11="February";
ch22=ch11;
break;
case 3:
String ch12="March";
ch22=ch12;
break;
case 4:
String ch13="April";
ch22=ch13;
break;
case 5:
String ch14="May";
ch22=ch14;
break;
case 6:
String ch15="June";
ch22=ch15;
break;
case 7:
String ch16="July";
ch22=ch16;
break;
case 8:
String ch17="August";
ch22=ch17;
break;
case 9:
String ch18="September";
ch22=ch18;
break;
case 10:
String ch19="October";
ch22=ch19;
break;
case  11:
String ch20="November";
ch22=ch20;
break;
case 12:
String ch21="December";
ch22=ch21;
break;}
System.out.println(ch22);System.out.println("\n\n"+"Where do you want to go Mr./Mrs "+ch4+" in the Following cities Through our Aeroplane Service from Kapurthala.\n1.Amritsar\n2.Srinagar\n3.Mumbai\n4.New Delhi\n5.Chennai\n6.Shimla\n7.Banglore\n8.Hyderabad\n9.Pune\n10.Gwaliar\n11.Chandigarh\n12.Kolkata\n13.Pathankot\n14.Surat\n15.Rajkot");
System.out.println("Enter your choice 1/2/3/4/5/6/7/8/9/10/11/12/13/14/15.");
int ch5=Integer.parseInt(input.readLine());
for(ch24=0;ch5>15;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch5);
System.out.println("Enter again month number");
ch5=Integer.parseInt(input.readLine());}
for(ch24=0;ch5<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch5);
System.out.println("Enter again option number");
ch5=Integer.parseInt(input.readLine());}
switch(ch5){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Amritsar","India",2500,intr);
break;
case 2: 
EnquiryForTicket(ch4,ch22,ch7,"Srinagar","India",3500,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Mumbai","India",6500,intr);
break;
case 4:
EnquiryForTicket(ch4,ch22,ch7,"New Delhi","India",5000,intr);
break;
case 5:
EnquiryForTicket(ch4,ch22,ch7,"Chennai","India",10000,intr);
break;
case 6:
EnquiryForTicket(ch4,ch22,ch7,"Shimla","India",6000,intr);
break;
case 7:
EnquiryForTicket(ch4,ch22,ch7,"Banglore","India",9000,intr);
break;
case 8:
EnquiryForTicket(ch4,ch22,ch7,"Hyderabad","India",7500,intr);
break;
case 9:
EnquiryForTicket(ch4,ch22,ch7,"Pune","India",7500,intr);
break;
case 10:
EnquiryForTicket(ch4,ch22,ch7,"Gwaliar","India",7500,intr);
break;
case 11:
EnquiryForTicket(ch4,ch22,ch7,"Chandigarh","India",3000,intr);
break;
case 12:
EnquiryForTicket(ch4,ch22,ch7,"Kolkata","India",8000,intr);
break;
case 13:
EnquiryForTicket(ch4,ch22,ch7,"Pathankot","India",1080,intr);
break;
case 14:
EnquiryForTicket(ch4,ch22,ch7,"Surat","India",6000,intr);
break;
case 15:
EnquiryForTicket(ch4,ch22,ch7,"Rajkot","India",6100,intr);
break;
}
System.out.println("\n\n"+"If you want to continue booking the tickets in the Domestic section then press 'y' otherwise press any other key.");
ch6=input.readLine();
}catch(Exception e){
System.out.println("\n\n"+"Error in Data entry."+"\n"+"Exception :-"+e);
}
}while(ch6.equalsIgnoreCase("y"));
}




static void intrFlig()throws IOException{
String ch6="0",intr="intr";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name.");
String ch4 =input.readLine();
try{do{System.out.println("\n\n"+"When do you want your Fligt?"+"\n"+"NOTE----Enter only month number in which you want to reserve your Flight in 2013."+"\n");
int ch7 =Integer.parseInt(input.readLine()); 
int ch24;
for(ch24=0;ch7>12;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong month number-"+ch7);
System.out.println("Enter again month number");
ch7=Integer.parseInt(input.readLine());}
for(ch24=0;ch7<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong month number-"+ch7);
System.out.println("Enter again month number");
ch7=Integer.parseInt(input.readLine());}
String ch22="0";
switch(ch7){
case 1:
String ch10="January";
ch22=ch10;
break;
case 2:
String ch11="February";
ch22=ch11;
break;
case 3:
String ch12="March";
ch22=ch12;
break;
case 4:
String ch13="April";
ch22=ch13;
break;
case 5:
String ch14="May";
ch22=ch14;
break;
case 6:
String ch15="June";
ch22=ch15;
break;
case 7:
String ch16="July";
ch22=ch16;
break;
case 8:
String ch17="August";
ch22=ch17;
break;
case 9:
String ch18="September";
ch22=ch18;
break;
case 10:
String ch19="October";
ch22=ch19;
break;
case  11:
String ch20="November";
ch22=ch20;
break;
case 12:
String ch21="December";
ch22=ch21;
break;}
System.out.println(ch22);
System.out.println("\n\n"+"Where do you want to go Mr./Mrs "+ch4+" in the Following cities Through our Aeroplane Service from Kapurthala. "+"\n"+"1.Inter-Continental Countries."+"\n"+"2.Continental Countries.");
System.out.println("Enter any option 1/2.\n\n");
int ch30=Integer.parseInt(input.readLine());
for(ch24=0;ch30>2;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch30);
System.out.println("Enter again month number");                                                                   
ch30=Integer.parseInt(input.readLine());}
for(ch24=0;ch30<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch30);
System.out.println("Enter again option number");
ch30=Integer.parseInt(input.readLine());}
int ch31=0,ch32=0;
if(ch30==1){
System.out.println("\n\nWhere do you want to go Mr./Mrs "+ch4+" in the Following countries Through our Aeroplane Service from Kapurthala. "+"\n"+"1.North-America"+"\n"+"2.South-America\n3.Australia\n4.Europe.");
System.out.println("Enter any option 1/2/3/4.");
ch31=Integer.parseInt(input.readLine());
for(ch24=0;ch31>4;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch31);
System.out.println("Enter again any option.");
ch31=Integer.parseInt(input.readLine());}
for(ch24=0;ch31<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch31);
System.out.println("Enter again any option.");
ch31=Integer.parseInt(input.readLine());}}
int opt2=0,optaus=0,opt6=0;
if(ch31==1){
System.out.println("\n\nMr/Ms/Mrs."+ch4+" in North America,in which country do you want to go as follows:-\n1.United States of America\n2.Mexico\n3.Greenland.");
System.out.println("Enter any option 1/2/3.");
opt2=Integer.parseInt(input.readLine());
for(ch24=0;opt2>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option.");
opt2=Integer.parseInt(input.readLine());}
for(ch24=0;opt2<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option.");
opt2=Integer.parseInt(input.readLine());}
if(opt2==1){
System.out.println("\n\nWhere do you want to go Mr./Mrs "+ch4+" in the Following cities of USA. "+"\n"+"1.New York"+"\n"+"2.Pennsylvania"+"\n"+"3.San Francisco\n4.Los Angeles\n5.San Jose\n6.Bismark\n7.Boston\n8.Washington(DC)\n9.Indianapolis\n10.Lincoln");
System.out.println("Enter any option 1/2/3/4/5/6/7/8/9/10.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>10;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"New York","United States Of America",54000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"San Francisco","United States Of America",55000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Pennsylvania","United States Of America",56000,intr);
break;
case 4:
EnquiryForTicket(ch4,ch22,ch7,"Los Angeles","United States Of America",56000,intr);
break;
case 5:
EnquiryForTicket(ch4,ch22,ch7,"San Jose","United States Of America",56000,intr);
break;
case 6:
EnquiryForTicket(ch4,ch22,ch7,"Bismark","United States Of America",56000,intr);
break;
case 7:
EnquiryForTicket(ch4,ch22,ch7,"Boston","United States Of America",56000,intr);
break;
case 8:
EnquiryForTicket(ch4,ch22,ch7,"Washington(DC)","United States Of America",56000,intr);
break;
case 9:
EnquiryForTicket(ch4,ch22,ch7,"Indianapolis","United States Of America",56000,intr);
break;
case 10:
EnquiryForTicket(ch4,ch22,ch7,"Lincoln","United States Of America",56000,intr);
break;}}}
if(opt2==2){
System.out.println("\n\nWhere do you want to go Mr./Mrs "+ch4+" in the Following cities of Mexico. "+"\n"+"1.Mexico City"+"\n"+"2.Los Mochis");
System.out.println("Enter any option 1/2.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>2;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Mexico City","Mexico",54000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Los Mochis","Mexico",55000,intr);
break;}}}
if(opt2==3){
System.out.println("\n\nWhere do you want to go Mr./Mrs "+ch4+" in the Following cities of GreenLand. "+"\n"+"1.Nuuk");
System.out.println("Enter any option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Nuuk","GreenLand",54000,intr);
break;}}}}
if(ch31==2){
System.out.println("Mr/Ms/Mrs."+ch4+" in South America,in which country do you want to go as follows:-\n1.Brazil\n2.Chile\n3.Argentina\n4.Colombia");
System.out.println("Enter any option 1/2/3/4.");
opt2=Integer.parseInt(input.readLine());
for(ch24=0;opt2>4;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option.");
opt2=Integer.parseInt(input.readLine());}
for(ch24=0;opt2<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option.");
opt2=Integer.parseInt(input.readLine());}
if(opt2==1){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Brazil:-\n1.Brasilia\n2.Belem\n3.Manaus\nEnter any option 1/2/3.");
optaus=Integer.parseInt(input.readLine());
for(ch24=0;optaus>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
for(ch24=0;optaus<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
switch(optaus){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Brasilia","Brazil",54000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Belem","Brazil",55000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Manaus","Brazil",56000,intr);
break;}}
if(opt2==2){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Chile:-\n1.Santiago\n2.Calama\n3.Valdivia\nEnter any option 1/2/3.");
optaus=Integer.parseInt(input.readLine());
for(ch24=0;optaus>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
for(ch24=0;optaus<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
switch(optaus){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Santiago","Chile",54000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Calama","Chile",55000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Valdivia","Chile",56000,intr);
break;}}
if(opt2==3){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Argentina:-\n1.Buenos Aires\n2.Mendoza\nEnter any option 1/2.");
optaus=Integer.parseInt(input.readLine());
for(ch24=0;optaus>2;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
for(ch24=0;optaus<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
switch(optaus){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Buenos Aires","Argentina",54000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Mendoza","Argentina",55000,intr);
break;}}
if(opt2==4){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Colombia:-\n1.Bogota\n2.Medellin\n3.Cali\nEnter any option 1/2/3.");
optaus=Integer.parseInt(input.readLine());
for(ch24=0;optaus>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
for(ch24=0;optaus<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
switch(optaus){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Bogota","Colombia",54000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Calama","Medellin",55000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Valdivia","Cali",56000,intr);
break;}}}
if(ch31==3){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Australia:-\n1.Perth\n2.Sydney\n3.Melbourne\nEnter any option 1/2/3.");
optaus=Integer.parseInt(input.readLine());
for(ch24=0;optaus>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
for(ch24=0;optaus<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optaus);
System.out.println("Enter again any option");
optaus=Integer.parseInt(input.readLine());}
switch(optaus){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Perth","Australia",54000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Melbourne","Australia",55000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Sydney","Australia",56000,intr);
break;}}
if(ch31==4){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following countries do you want to go in Europe:-\n1.Spain\n2.England(United Kingdom)\n3.Germany\n4.Italy\n5.Finland\n6.Norway\n7.Ireland\n8.France\n9.Greece\n10.Austria\n11.Poland");
System.out.println("Enter any option 1/2/3/4/5/6/7/8/9/10/11.");
opt2=Integer.parseInt(input.readLine());
for(ch24=0;opt2>11;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option");
opt2=Integer.parseInt(input.readLine());}
for(ch24=0;opt2<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt2);
System.out.println("Enter again any option");
opt2=Integer.parseInt(input.readLine());}
if(opt2==1){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Spain:-\n1.Madrid\n2.Barcelona\n3.Sevilla\nEnter any option 1/2/3.");
int optspain=Integer.parseInt(input.readLine());
for(ch24=0;optspain>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optspain);
System.out.println("Enter again any option");
optspain=Integer.parseInt(input.readLine());}
for(ch24=0;optspain<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optspain);
System.out.println("Enter again any option");
optspain=Integer.parseInt(input.readLine());}
switch(optspain){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Madrid","Spain",40000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Barcelona","Spain",40000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Sevilla","Spain",40000,intr);}}
if(opt2==2){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in England(United Kingdom):-\n1.London\n2.Dover\n3.Sheffied\n4.Birmingham\nEnter any option 1/2/3/4.");
int optuk=Integer.parseInt(input.readLine());
for(ch24=0;optuk>4;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optuk);
System.out.println("Enter again any option");
optuk=Integer.parseInt(input.readLine());}
for(ch24=0;optuk<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optuk);
System.out.println("Enter again any option");
optuk=Integer.parseInt(input.readLine());}
switch(optuk){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"London","United-Kingdom",52300,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Dover","United-Kingdom",52800,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Sheffied","United-Kingdom",53800,intr);
break;
case 4:
EnquiryForTicket(ch4,ch22,ch7,"Birmingham","United-Kingdom",54300,intr);
break;}}
if(opt2==3){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Germany:-\n1.Berlin\n2.Hamburg\n3.Frankfurt\n4.Munich\n5.Bonn\nEnter any option 1/2/3/4/5.");
int optgermany=Integer.parseInt(input.readLine());
for(ch24=0;optgermany>5;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgermany);
System.out.println("Enter again any option");
optgermany=Integer.parseInt(input.readLine());}
for(ch24=0;optgermany<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgermany);
System.out.println("Enter again any option");
optgermany=Integer.parseInt(input.readLine());}
switch(optgermany){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Berlin","Germany",44500,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Hamburg","Germany",45000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Frankfurt","Germany",45500,intr);
break;
case 4:
EnquiryForTicket(ch4,ch22,ch7,"Munich","Germany",46000,intr);
break;
case 5:
EnquiryForTicket(ch4,ch22,ch7,"Bonn","Germany",46500,intr);
break;}}
if(opt2==4){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Italy:-\n1.San-Mario\n2.Rome\nEnter any option 1/2.");
int optitaly=Integer.parseInt(input.readLine());
for(ch24=0;optitaly>2;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optitaly);
System.out.println("Enter again any option");
optitaly=Integer.parseInt(input.readLine());}
for(ch24=0;optitaly<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optitaly);
System.out.println("Enter again any option");
optitaly=Integer.parseInt(input.readLine());}
switch(optitaly){
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Rome","Italy",51000,intr);
break;
case 1:
EnquiryForTicket(ch4,ch22,ch7,"San-Mario","Italy",49999,intr);
break;}}
if(opt2==5){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Finland:-\n1.Helsinki\nEnter option 1.");
int optfinland=Integer.parseInt(input.readLine());
for(ch24=0;optfinland>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optfinland);
System.out.println("Enter again any option");
optfinland=Integer.parseInt(input.readLine());}
for(ch24=0;optfinland<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optfinland);
System.out.println("Enter again any option");
optfinland=Integer.parseInt(input.readLine());}
switch(optfinland){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Helsinki","Finland",49800,intr);
break;}}
if(opt2==6){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Norway:-\n1.Oslo\nEnter option 1.");
int optnorway=Integer.parseInt(input.readLine());
for(ch24=0;optnorway>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optnorway);
System.out.println("Enter again any option");
optnorway=Integer.parseInt(input.readLine());}
for(ch24=0;optnorway<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optnorway);
System.out.println("Enter again any option");
optnorway=Integer.parseInt(input.readLine());}
switch(optnorway){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Oslo","Norway",50000,intr);
break;}}
if(opt2==7){//ireland=dublin
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Ireland:-\n1.Dublin\nEnter option 1.");
int optireland=Integer.parseInt(input.readLine());
for(ch24=0;optireland>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optireland);
System.out.println("Enter again any option");
optireland=Integer.parseInt(input.readLine());}
for(ch24=0;optireland<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optireland);
System.out.println("Enter again any option");
optireland=Integer.parseInt(input.readLine());}
switch(optireland){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Dublin","Ireland",48000,intr);
break;}}//france=paris,lyon,montpellier
if(opt2==8){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in France:-\n1.Paris\n2.Lycon\n3.Montpellier\nEnter any option 1/2/3.");
int optfrance=Integer.parseInt(input.readLine());
for(ch24=0;optfrance>3;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optfrance);
System.out.println("Enter again any option");
optfrance=Integer.parseInt(input.readLine());}
for(ch24=0;optfrance<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optfrance);
System.out.println("Enter again any option");
optfrance=Integer.parseInt(input.readLine());}
switch(optfrance){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Paris","France",41000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Lycon","France",40000,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Montpellier","France",39900,intr);
break;}}
if(opt2==9){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Greece:-\n1.Athens\nEnter option 1.");
int optgreece=Integer.parseInt(input.readLine());
for(ch24=0;optgreece>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgreece);
System.out.println("Enter again any option");
optgreece=Integer.parseInt(input.readLine());}
for(ch24=0;optgreece<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgreece);
System.out.println("Enter again any option");
optgreece=Integer.parseInt(input.readLine());}
switch(optgreece){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Athens","Greece",46000,intr);
break;}}
if(opt2==10){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Austria:-\n1.Vienna\nEnter option 1.");
int optgreece=Integer.parseInt(input.readLine());
for(ch24=0;optgreece>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgreece);
System.out.println("Enter again any option");
optgreece=Integer.parseInt(input.readLine());}
for(ch24=0;optgreece<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optgreece);
System.out.println("Enter again any option");
optgreece=Integer.parseInt(input.readLine());}
switch(optgreece){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Vienna","Austria",43000,intr);
break;}}
if(opt2==11){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Poland:-\n1.Warsaw\nEnter option 1.");
int optpoland=Integer.parseInt(input.readLine());
for(ch24=0;optpoland>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optpoland);
System.out.println("Enter again any option");
optpoland=Integer.parseInt(input.readLine());}
for(ch24=0;optpoland<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+optpoland);
System.out.println("Enter again any option");
optpoland=Integer.parseInt(input.readLine());}
switch(optpoland){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Warsaw","Poland",43500,intr);
break;}}}
if(ch30==2){
System.out.println("\n\nWhere do you want to go Mr./Mrs "+ch4+" in the Following countries Through our Aeroplane Service from Kapurthala :-\n1.Thailand\n2.Pakistan\n3.Russia\n4.Japan\n5.China\n6.Bangladesh\n7.Malaysia\n8.Mongolia\n9.Nepal");
System.out.println("Enter any option 1/2/3/4/5/6/7/8/9.");
ch32=Integer.parseInt(input.readLine());
for(ch24=0;ch32>9;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch32);
System.out.println("Enter again any option.");
ch32=Integer.parseInt(input.readLine());}
for(ch24=0;ch32<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+ch32);
System.out.println("Enter again option number");
ch32=Integer.parseInt(input.readLine());}
if(ch32==1){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Thailand:-\n1.Bangkok\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Bangkok","Thailand",4589,intr);
break;}}
if(ch32==2){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Pakistan:-\n1.Lahore\n2.Islamabad\nEnter option 1/2.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Lahore","Pakistan",4589,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Islamabad","Pakistan",5000,intr);
break;}}
if(ch32==3){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Russia:-\n1.Moscow\n2.Novosibirsk\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Moscow","Russia",4589,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Novosibirsk","Russia",5000,intr);
break;}}
if(ch32==4){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Japan:-\n1.Tokyo\n2.Hiroshima\n3.Yokohama\nEnter option 1/2/3.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Tokyo","Japan",4589,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Yokohama","Japan",5000,intr);
break;}}
if(ch32==5){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in China:-\n1.Beijing\n2.Bhutan\n3.Shanghai\n4.Nanjing\nEnter option 1/2/3/4.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>4;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
switch(opt6){
case 1:
EnquiryForTicket(ch4,ch22,ch7,"Beijing","China",18000,intr);
break;
case 2:
EnquiryForTicket(ch4,ch22,ch7,"Bhutan","China",15590,intr);
break;
case 3:
EnquiryForTicket(ch4,ch22,ch7,"Shanghai","China",20100,intr);
break;
case 4:
EnquiryForTicket(ch4,ch22,ch7,"Nanjing","China",24000,intr);
break;
}}
if(ch32==6){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Bangladesh:-\n1.Dhaka\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
if(opt6==1){
EnquiryForTicket(ch4,ch22,ch7,"Dhaka","Bangladesh",16500,intr);}}
if(ch32==7){
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Malaysia:-\n1.Singapore\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
if(opt6==1){
EnquiryForTicket(ch4,ch22,ch7,"Malaysia","Singapore",20000,intr);}}
if(ch32==8){//mongolia=ulan bator
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Mongolia:-\n1.Ulan Bator\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
if(opt6==1){
EnquiryForTicket(ch4,ch22,ch7,"Ulan Bator","Mongolia",26500,intr);}}
if(ch32==9){//nepal=kathmandu
System.out.println("Mr/Ms/Mrs."+ch4+" in which of the following cities do you want to go in Nepal:-\n1.Kathmandu\nEnter option 1.");
opt6=Integer.parseInt(input.readLine());
for(ch24=0;opt6>1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again any option.");
opt6=Integer.parseInt(input.readLine());}
for(ch24=0;opt6<1;ch24=ch24){
System.out.println("\n\n"+"You had entered wrong option number-"+opt6);
System.out.println("Enter again option number");
opt6=Integer.parseInt(input.readLine());}
if(opt6==1){
EnquiryForTicket(ch4,ch22,ch7,"Kathmandu","Nepal",16500,intr);}}
System.out.println("\n\n"+"If you want to continue booking the tickets in the International section then press 'y' otherwise press any other key.");
ch6=input.readLine();}
}while(ch6.equalsIgnoreCase("y"));
}catch(Exception e){
System.out.println("\n\n"+"Error in Data entry."+"\n"+"Exception :-"+e);
}
}














static void EnquiryForTicket(String n,String n1,int nn,String nameclas,String country,double a1,String chh)throws IOException
{
if(chh=="intr"){
intrEnquiry(n,n1,nn,nameclas,country,a1);
}
if(chh=="domst"){
domstEnquiry(n,n1,nn,nameclas,country,a1);
}
}

public static void domstEnquiry(String n,String n1,int nn,String nameclas,String country,double a1)throws IOException{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String aa="0";
int ch25 = 1;
do{
System.out.println("\n\n"+"Mr/Mrs. "+n+" , You want you trip as:-"+"\n"+"1.One Way Trip"+"\n"+"2.Round Trip"+"\n"+"Enter your choice 1/2");
try{
int ch3=Integer.parseInt(input.readLine());
for(int ch28=0;ch3>2;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch3+".");
System.out.println("Enter again any option.");
ch3=Integer.parseInt(input.readLine());}
for(int ch28=0;ch3<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch3+".");
System.out.println("Enter again any option.");
ch3=Integer.parseInt(input.readLine());}
String tictype="0";
if(ch3==1){
tictype="One Way Trip";
}
if(ch3==2){
tictype="Round Trip";
}
double ch28=0;
int ch7=0;
String reserveclass="0";
System.out.println("\n\n"+"Mr./Mrs. "+n+" you want your flight reservation in :-"+"\n"+"1.General Class"+"\n"+"2.Business Class"+"\n"+"Enter your choice 1/2");
ch7=Integer.parseInt(input.readLine());
for(int ch29=0;ch7>2;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch7+".");
System.out.println("Enter again any option.");
ch7=Integer.parseInt(input.readLine());}
for(int ch29=0;ch7<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch7+".");
System.out.println("Enter again any option.");
ch7=Integer.parseInt(input.readLine());}
if (ch7==1){
reserveclass="General Class.";
}
if (ch7==2){
reserveclass="Business Class..";
}
System.out.println("\n\n"+"Mr./Mrs. "+n+" you want your food as :-"+"\n"+"1.Non-Veg"+"\n"+"2.Veg"+"\n"+"Enter your choice 1/2");
int ch30=Integer.parseInt(input.readLine());
for(int ch29=0;ch30>2;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch30+".");
System.out.println("Enter any option again.");
ch30=Integer.parseInt(input.readLine());}
for(int ch29=0;ch30<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch30+".");
System.out.println("Enter any option  again.");
ch30=Integer.parseInt(input.readLine());}
String foodtype="0";
if (ch30==1){
foodtype="Non-Veg.";
}
if (ch30==2){
foodtype="Veg.";
}
System.out.println("\n\n"+"Mr/Mrs. "+n+",Enter date of Flight which are going to "+nameclas+" in the month  "+n1+":-" );
int ch32=Integer.parseInt(input.readLine());
int ch29;
if(n1=="January"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="February"){
for(ch29=0;ch32>28;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="March"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="April"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="May"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="June"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="July"){
for(ch29=0;ch32>28;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="August"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="September"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="October"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="November"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="December"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
int datenum=0;
datenum=ch32;
String t1=nameclas+datenum+nn;
String clasname=nameclas;
if(ch3==1&&ch7==1){
ch28=(a1*ch3);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==1&&ch7==2){//name,month name,month number(ch4,ch22,ch7)(n,n1,nn)
ch28=(a1*ch3+10000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==2&&ch7==1){
ch28=(a1*ch3);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==2&&ch7==2){
ch28=(a1*ch3+10000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
}catch(Exception e){
System.out.println("\n\n"+"Error in Data entry."+"\n"+"Exception :-"+e);
}System.out.println("\n\n"+"Mr/Mrs."+n+" , If you want to continue booking more tickets for "+nameclas+" press y otherwise press any other key");
aa=input.readLine();
}while(aa.equalsIgnoreCase("y"));
}



public static void intrEnquiry(String n,String n1,int nn,String nameclas,String country,double a1)throws IOException{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String aa="0";
int ch25 = 1;
do{
System.out.println("\n\n"+"Mr/Mrs. "+n+" , You want you trip as:-"+"\n"+"1.One Way Trip"+"\n"+"2.Round Trip"+"\n"+"Enter your choice 1/2");
try{
int ch3=Integer.parseInt(input.readLine());
for(int ch28=0;ch3>2;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch3+".");
System.out.println("Enter again any option.");
ch3=Integer.parseInt(input.readLine());}
for(int ch28=0;ch3<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch3+".");
System.out.println("Enter again any option.");
ch3=Integer.parseInt(input.readLine());}
String tictype="0";
if(ch3==1){
tictype="One Way Trip";
}
if(ch3==2){
tictype="Round Trip";
}
double ch28=0;
int ch7=0;
String reserveclass="0";
System.out.println("\n\n"+"Mr./Mrs. "+n+" you want your flight reservation in which of the following class:-"+"\n"+"1.Economy"+"\n"+"2.Business\n3.Premium Economy\n4.First Class\n"+"Enter your choice 1/2/3/4.");
ch7=Integer.parseInt(input.readLine());
for(int ch29=0;ch7>4;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch7+".");
System.out.println("Enter again any option.");
ch7=Integer.parseInt(input.readLine());}
for(int ch29=0;ch7<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch7+".");
System.out.println("Enter again any option.");
ch7=Integer.parseInt(input.readLine());}
if (ch7==1){
reserveclass="Economy Class.";
}
if (ch7==2){
reserveclass="Business Class.";
}
if (ch7==3){
reserveclass="Premium Economy Class.";
}
if (ch7==4){
reserveclass="First Class.";
}
System.out.println("\n\n"+"Mr./Mrs. "+n+" you want your food as :-"+"\n"+"1.Non-Veg"+"\n"+"2.Veg"+"\n"+"Enter your choice 1/2");
int ch30=Integer.parseInt(input.readLine());
for(int ch29=0;ch30>2;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch30+".");
System.out.println("Enter any option again.");
ch30=Integer.parseInt(input.readLine());}
for(int ch29=0;ch30<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong option - "+ch30+".");
System.out.println("Enter any option  again.");
ch30=Integer.parseInt(input.readLine());}
String foodtype="0";
if (ch30==1){
foodtype="Non-Veg.";
}
if (ch30==2){
foodtype="Veg.";
}
System.out.println("\n\n"+"Mr/Mrs. "+n+",Enter date of Flight which are going to "+nameclas+" in the month  "+n1+":-" );
int ch32=Integer.parseInt(input.readLine());
int ch29;
if(n1=="January"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="February"){
for(ch29=0;ch32>28;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="March"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="April"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="May"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="June"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="July"){
for(ch29=0;ch32>28;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="August"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="September"){
for(ch29=0;ch32>30;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="October"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="November"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
if(n1=="December"){
for(ch29=0;ch32>31;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option again.");
ch32=Integer.parseInt(input.readLine());}
for(ch29=0;ch32<1;ch25=ch25){
System.out.println("\n\n"+"You had entered wrong date - "+ch32+".");
System.out.println("Enter any option  again.");
ch32=Integer.parseInt(input.readLine());}}
int datenum=0,ch33;
datenum=ch32;
String t1=nameclas+datenum+nn,clasname=nameclas;
if(ch3==1&&ch7==1){
ch28=(a1*ch3);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==1&&ch7==2){//name,month name,month number(ch4,ch22,ch7)(n,n1,nn)
ch28=(a1*ch3+10000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==2&&ch7==1){
ch28=(a1*ch3);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}//ch3==round or winga.
if(ch3==2&&ch7==2){
ch28=(a1*ch3+10000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==1&&ch7==3){
ch28=(a1*ch3-1000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);//1.Economy"+"\n"+"2.Business\n3.Premium Economy\n4.First Class\n"+"Enter your choice 1/2/3/4.
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==2&&ch7==3){
ch28=(a1*ch3-2000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==1&&ch7==4){
ch28=(a1*ch3+20000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);//1.Economy"+"\n"+"2.Business\n3.Premium Economy\n4.First Class\n"+"Enter your choice 1/2/3/4.
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}
if(ch3==2&&ch7==4){
ch28=(a1*ch3+20000);
System.out.println("\n\n"+"Mr/Mrs. "+n+" ,You have to pay Rs."+ch28);
ticketviewer(n,n1,datenum,foodtype,ch28,reserveclass,clasname,country,t1,tictype);}

}catch(Exception e){
System.out.println("\n\n"+"Error in Data entry."+"\n"+"Exception :-"+e);
}System.out.println("\n\n"+"Mr/Mrs."+n+" , If you want to continue booking more tickets for "+nameclas+" press y otherwise press any other key");
aa=input.readLine();
}while(aa.equalsIgnoreCase("y"));
}

static void ticketviewer(String name,String monthname,int datenum,String foodfood,double moneyofticket,String reserve,String destny,String country,String ticnum,String tictype)throws IOException{
System.out.println("***Notice  --> Mr/Mrs."+name+" ,You Are Instructed to reach Departure Section of Airport at 11:30AM on your given Date. \nThe Ticket printed in this Prog is just copy of ticket.");
System.out.println("The Original Ticket will be given to You at Airport.\n If you want to Cancel Your ticket donot reach airport and Your Amount will be refunded after 1week to you after deducting Rs.1000");
Date d=new Date();
System.out.println("\nRelease of ticket at->"+d+"\n*********************************************************************************************************************************************************");
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  Flight Code = "+ticnum+"   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ");
                        System.out.println("*  Name  = "+"Mr/Mrs."+ name);
                        System.out.println("*  Destiny   = "+destny+" in Country "+country    +"                 *Type of reservation -"+tictype  );
                        System.out.println("*  Terminal --variable                                               *Class of reservation = "+reserve);
                        System.out.println("*  Cost of Ticket =Rs."+moneyofticket  +"                            *Food Type= "+foodfood);
                        System.out.println("*  Max lug              = 25kg                                       *Date of Flight-"+monthname+"/"+datenum+"/2013");                                                                                                    
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@            THANKS          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*");
                        System.out.println("**********************************************************************************************************************************************************");
                        System.out.println("Cost of ticket is exclusive of tax.\n\n");
                        moneytransfer(name,moneyofticket);
                    }

                    
                    


static void moneytransfer(String name,Double moneyofticket)throws IOException{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
double TAX=((12.5/100)*(moneyofticket));
System.out.println("**TAX ON TICKET IS 12.5%.SO YOU NEED TO PAY Rs.+"+TAX+" MORE ON YOUR TICKET COST=Rs."+moneyofticket+"**\n");
moneyofticket=moneyofticket+TAX;
System.out.println("Mr/Ms/Mrs."+name+" ,you can pay to us using the following ways--\n1.Cash\n2.Debit Card\n3.Credit Card\n4.Wire Transfer\n5.Draft.");
System.out.println("Enter any option 1/2/3/4/5.\n");
try{
int opt=Integer.parseInt(input.readLine());
int ch1;
for(ch1=0;opt>5;ch1=ch1){
System.out.println("\n\n"+"You had entered wrong option - "+opt+".");
System.out.println("Enter again any option.");
opt=Integer.parseInt(input.readLine());}
for(ch1=0;opt<1;ch1=ch1){
System.out.println("\n\n"+"You had entered wrong option - "+opt+".");
System.out.println("Enter again any option.");
opt=Integer.parseInt(input.readLine());}
switch(opt){
case 1:
System.out.println("You can pay to us by depositing Rs."+moneyofticket+" at our center in Kapurthala.");
break;
case 2:
System.out.println("Enter your Debit Card Number");
long dbtcard=Integer.parseInt(input.readLine());
System.out.println("Enter your Debit Card Pin Number(password)");
long pass=Integer.parseInt(input.readLine());
System.out.println("If your Debit Card number and password is found to be wrong then your ticket will be automatically cancelled.");
break;
case 3:
System.out.println("Enter your Credit Card Number");
long Creditcard=Integer.parseInt(input.readLine());
System.out.println("Enter your Credit Card Pin Number(password)");
long passcredit=Integer.parseInt(input.readLine());
System.out.println("If your Credit Card number and password is found to be wrong then your ticket will be automatically cancelled.");
break;
case 4:
System.out.println("Our Account number is 0999884432 in HDFC Bank,Kapurthala so you need to make wire transfer of Rs"+moneyofticket);
break;
case 5:
System.out.println("Our Account number is 0999884432 in HDFC Bank,Kapurthala so you need to send a draft of Rs"+moneyofticket+" payable by NAVROOP SINGH BAJWA.");
break;
}
}
catch(Exception e){
System.out.println("An Exception Occured during Execution of the payment->"+e);
System.out.println("Mr/Ms/Mrs."+name+" ,your ticket is now being cancelled.");
}
}
}
