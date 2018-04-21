Feature: Login for leaftaps
@Smoke
Scenario Outline: MergeLead positive Flow
And enter the user name as <uname>
And enter the password as <pwd>
When click on loginbutton 
When Click on CRM/SFA
When Click on Leads
When Click on merge Lead
When clicknearfromlead
And enterlead as <fromleadid>
When clickfindleads
When clickfirstresultleads
When clickneartolead
And enterlead as <toleadid>
When clickfindleads
When clickfirstresultleads
When clickmerge
When acceptalerts
When Click on find Lead
And enterlead as <fromleadid>
When clickfindbutton
Then verifyerrormsg as <errormsg>

Examples:
|uname|pwd|fromleadid|toleadid|errormsg|
|Demosalesmanager|13158||13147|No records to display|






