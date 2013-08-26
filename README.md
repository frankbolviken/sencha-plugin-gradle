sencha-plugin-gradle
====================

SenchaPlugin for Gradle

# Requirements
 - This plugin installed in your local repository (Maven for instance)
 - Gradle installed (but ofcourse)
 - Sencha CMD installed

# How to install this plugin (Manual task for now)
 - Clone this project
 - Update build.gradle to point to your repository
 - Execute the following command from command line
 		
 		gradle install

# Usage
 - Make sure to add reference to the repository where plugin is installed in your build.gradle file
 		
 		buildscript {
		    repositories {
		        maven {
		            url uri('url/to/repo')
		        }
		    }
		    dependencies {
		        classpath group: 'sencha-plugin-gradle',
		                name: 'Sencha',
		                version: '0.1-SNAPSHOT'
		    }
		}

 - Include 'sencha' plugin in your gradle project

 		apply plugin:'sencha'

 - Configure the plugin to fit your environment

	 	sencha {
	        webappName = 'appname' // The Name of your Sencha Application
	        webappDir = '.' // THe path to the sencha app (defaults to '.', can be left out if this is correct)
	        environment = 'testing' // The version you want to build (production, testing) etc
	    }

 - Execute gradle war to get your WAR file with correct files

 		gradle war -Dversion=yourversion