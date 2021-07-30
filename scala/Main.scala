
import scala.io.StdIn.readInt;
import java.util.Scanner;
import scala.util.control._


object SeatReservationProblem{
  def main(arg:Array[String]){
   val max_row=4
   val max_colomn=15
   val seat_des_table=Array.ofDim[Int](4,61)
   val seat_table=Array.ofDim[Int](5,16)
   var rsvd=1
   var vacancy=0
   val n=max_row*max_colomn
   var destination=0
   var ch=0
   var seatt=0
   var i=0

    println("=====================================================================================================================");
    println("                                          Welcome to Asia Airlines..");

   do{
    println("=====================================================================================================================")

   println("\nReserve Your Seat for Colombo -> Mattala -> India -> Landon");
 	 var input3 = new Scanner(System.in);
 	 print("\nEnter the number of seats ");
 	 var seatc=input3.nextInt();
         seatt=seatt+seatc; 

   println("\nStart station \n-> 1 for Colombo \n-> 2 for Mattala \n-> 3 for India");


    var s = new Scanner(System.in);
    print("Select start station ");
    var start=s.nextInt();  
	if(start==1){
	    println("\nDestinations \n-> 1 for Mattala \n-> 2 for India \n-> 3 for Landon ");
	        var d = new Scanner(System.in);
  	        print("Select destination ");
    		var destination=d.nextInt();

 	   for(i<-start to destination){	
   	     for(j<-1 to seatt){
	     seat_des_table(i)(j)=1;
             }
           }

	}else if(start==2){
	    println("\nDestinations \n-> 1 for India \n-> 2 for Landon ");
	        var d = new Scanner(System.in);
  	        print("Select destination ");
    		var destination=d.nextInt();	
		
	   if(start==destination){
 	   for(i<-destination to start+1){	
   	     for(j<-1 to seatt){
	     seat_des_table(i)(j)=1;
             }
           }
	   }
	   else{
 	   for(i<-destination to destination ){	
   	     for(j<-1 to seatt){
	     seat_des_table(i)(j)=1;
             }
           }	   
           }

	}
	 else if(start==3){
	    println("\nDestinations \n-> 1 for Landon ");
	        var d = new Scanner(System.in);
  	        print("Select destination ");
    		var destination=d.nextInt();	
 	   for(i<-start to destination){	
   	     for(j<-1 to seatt){
	     seat_des_table(i)(j)=1;
             }
           }	
	}


   println("\nAvailable(0) Seats' Location");
   println("==============================");
    for(x<-1 to max_row){
      for(y<-1 to max_colomn){
        vacancy=seat_table(x)(y);
        print(vacancy+" ");
      }
        println("| ");
    }
   println("==============================");

     println("Select the seats' location");
   	 for(i<-1 to seatc){
	  var input1 = new Scanner(System.in);
 	  print("Enter the colomn - ");
  	  var bc=input1.nextInt();

 	  var input2 = new Scanner(System.in);
 	  print("Enter the row - ");
 	  var br=input2.nextInt();

	     seat_table(br)(bc)=1;
	 }


   println("\nBooked Seats");
   println("==============================");

    for(x<-1 to max_row){
      for(y<-1 to max_colomn){
        vacancy=seat_table(x)(y);
        print(vacancy+" ");
      }
        println("| ");
    }
   println("==============================\n");
        println("Seat Availability according to the Destination ");
         print("Desti\\S");   
	for(k<-1 to n){
		if(k<10){
                 print("  "+k);
		}
		else{
                 print(" "+k);
		}
  
	}
        println(" ");
 	 for(i<-1 to 3){
              print(i+" to "+(i+1)+"|");
   	   for(j<-1 to n){
               vacancy=seat_des_table(i)(j);
                 print("  "+vacancy);

	   }
    	    println(" ");
   	 }    


    
   var ch1 = new Scanner(System.in);
   print("\nDo you want to continue..(Yes->1)");
   print("\n");
   var ch=ch1.nextInt();

}while(ch<2)

   println("-----End-----");

  }
}
