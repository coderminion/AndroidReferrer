# AndroidReferrer
Android Referrer gives idea to how to get android referrer from google play link to track where the installs are coming from


<h1>Testing</h1>
1.Launch application in phone.
2.Go to your terminal/commandline and type :

adb shell

am broadcast -a com.android.vending.INSTALL_REFERRER -n com.coderminion.referer/.RefererDataReciever --es "referrer" "Hey this is install from http://coderminion.com"

Or 

upload APK to Google Play Store and go to URL : https://play.google.com/store/apps/details?id=com.coderminion.referer&referrer=my_value

URI scheme : market://details?id=com.coderminion.referer&referrer=my_value



<h1>Youtube</h1>
https://www.youtube.com/watch?v=of2xF-biyyA

<h1>Screenshots</h1>

<img src="/sample1.png"/>
