# AndroidReferrer
Android Referrer gives idea to how to get android referrer from google play link to track where the installs are coming from


<h1>Testing</h1>
1.Launch application in phone.
2.Go to your terminal/commandline and type :

adb shell

am broadcast -a com.android.vending.INSTALL_REFERRER -n com.coderminion.referer/.RefererDataReciever --es "referrer" "Hey this is install from http://coderminion.com"

<h1>Youtube</h1>


<h1>Screenshots</h1>

<img src="/sample1.png"/>
