# Thost


## Installation

Add this in your  ```build.gradle``` file

```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Add this to your module's ```build.gradle``` file
```java
dependencies {
	        implementation 'com.github.FiratGURGUR:Thost:1.0'
	}
  ```
  
  ## Usage
  ### 1. MixedThost
  #### 1.1 Succes Toast:
  
 ```
 MixedThost.success(MainActivity.this, "Success toast!").show();
 ```
  #### 1.2 Error Toast:
  
 ```
 MixedThost.eror(MainActivity.this, "Error toast!").show();
 ```
   #### 1.3 Warning Toast:
  
 ```
 MixedThost.warning(MainActivity.this, "Warning toast!").show();
 ```
   #### 1.4 Info Toast:
  
 ```
 MixedThost.info(MainActivity.this, "Info toast!").show();
 ```
   ### 2. Custom Thost
   
   With thost, you can set the toast message as you wish. You just need to specify the features you want to add
   
   Base Custom Thost:
```java
   new Thost()
            .setContext(MainActivity.this)
            .setTitle("Since it is clearly mentioned as 'impossible to lternative method and I clearly mentioned it as well.")
            .create().thost().show();
 ```
 Thost Radius :
 ```
 .setRadius(25)
 ```
  Thost Color :
 ```
 .setColor(getColor(R.color.colorAccent))
 ```
   Thost Add icon :
 ```
.setIcon(R.drawable.icon)
 ```
   Thost icon tint color :
 ```
.seticonTintColor(R.color.colorPrimary)
 ```
   Thost Text color :
 ```
.setTextColor(R.color.colorPrimary)
 ```
   Thost Text size :
 ```
.setTextSize(9)
 ```
   Thost Text font :
 ```
 .setFont(R.font.fontname)
 ```
 ### Screenshots
 
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc1.png" width="45%">   <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc2.png" width="45%">  
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc3.png" width="45%">  <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc4.png" width="45%">  
 
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc6.png" width="45%">   <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc7.png" width="45%">   
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc8.png" width="45%">   <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc9.png" width="45%">   
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc10.png" width="45%">  <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc11.png" width="45%">   
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc12.png" width="45%">  <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc13.png" width="45%">   
 <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc14.png" width="45%">   <img src="https://github.com/FiratGURGUR/Thost/blob/master/app/screens/sc15.png" width="45%"> 
   
 
