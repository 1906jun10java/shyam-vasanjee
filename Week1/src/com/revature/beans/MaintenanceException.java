package com.revature.beans;

public class MaintenanceException extends Exception {
	
	/*
	 * Custom Checked Exception
	 */
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public MaintenanceException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public MaintenanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public MaintenanceException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}

		public MaintenanceException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}

		public MaintenanceException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
		


}
