package com.pk.SessionMgmt;

import jakarta.servlet.ServletRequestEvent;

import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    public RequestListener() {
    }
    public void requestInitialized(ServletRequestEvent event)  { 
    	System.out.println("Request created");
    	
    }
    public void requestDestroyed(ServletRequestEvent event)  { 
    	System.out.println("Request Destroyed");
    	
    }
	
}
