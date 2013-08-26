sencha-plugin-gradle
====================

SenchaPlugin for Gradle

# Requirements
 - Sencha CMD installed

# Usage
 - Include 'sencha' plugin in your gradle project

 		apply plugin:'sencha'

 - Configure the plugin to fit your environment

	 	sencha {
	        webappName = 'testproject' // The Name of your Sencha Application
	        webappDir = '.' // THe path to the sencha app (defaults to '.', can be left out if this is correct)
	        environment = 'testing' // The version you want to build (production, testing) etc
	    }

 - Execute gradle war to get your WAR file with correct files

 		gradle war -Dversion=yourversion