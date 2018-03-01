package com.tavant.SingletonPattern;
/** Singleton pattern ensures that only one object is getting created and been accessed throughout the application.used in places like registry /caching etc **/
public  class SingletonClass {
    /* Eager loading of single instance
	private static volatile SingletonClass singleInstance = new SingletonClass();
	*/
	
	/* single instance is initialised when it is required favouring lazy loading .volatile key word is used as this variable will be accessed by multiple threads.
	 * using volatile make sures that when variable value is changed by one thread ,
	 * it is updated directly in main memory instead of updating in caches specific to that thread
	 *  and all other threads will be able to see the updated values.if volatile s not used,then multiple threads might end up updating same value*/
	private static volatile SingletonClass singleInstance;
	
	/* private constructor makes sure that this class cannot be instantiated from outside by other classes */
	private SingletonClass(){
		
	}
	
	public static SingletonClass getInstance(){
		if(null == singleInstance){
			/* using synchronized makes this block thread safe.
			 * so that multiples threads cannot access this method at the same time thereby creating multiple objects.
			 * even though synchronized  decreases performance,this block will be called only at the first time.so this is better way to create thread safe object*/
			synchronized(SingletonClass.class){
				if(null == singleInstance){
					singleInstance = new SingletonClass();
				}
			}
		}
		return singleInstance;
	}
}
