# super-java_Thread

Life Cycle of Thread

	1)New Thread
  
		Thread t1=new Thread();
    
    
	2)Runnable
  
		When thread is started
    
		t1.start();
    
			start() method is internally calling run() method of Runnable interface which is responsible for executing ur business logic as a thread.
      
      
	3)Not Runnable
  
		Sleeping
    
		waiting
    
    Thread1  he wants to access file file1

    Thread2 also working on file1

		blocked by another thread

	  Thread for user connecion to anywebsite
    
    
	4)Dead

		when thread has its natural death.
    
