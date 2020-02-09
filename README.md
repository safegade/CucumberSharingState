# CucumberSharingState
<h2> A simple example of sharing state using Pico Container.</h2>
<h3>Background: </h3>
<p>
Let's say you have multiple reports on a particular portal.
Testing these reports involves below common steps: 
</p>
 <li> Login to portal </li>
 <li> Navigating to the given report </li>
<br/>

<p>
And certain specific steps for different reports.
This example considers only two reports and steps as below:
</p> 
 <li> Report 1 has below two steps, located in MyFeature_1.feature </li>
 <li> Includes common steps </li>
 <li> Reading state break down summary table </li>
 <li> Asserting state break down summary table numbers </li>
 --------------------------------------------------------------------------------------------
 <li> Report 2 has below two steps, located in MyFeature_2.feature </li>
 <li> Includes common steps </li>
 <li> Reading dashboard metrics figures </li>
 <li> Asserting dashboard metrics figures </li>
 <br/>

<h3> Designing Java Step Definition Classes </h3> 
 <p>
 For common steps stated above, CommonSteps.java class is created. 
 <br>
 For Report 1, SpecificStep1.java class is created.
 <br>
 For Report 2, SpecificStep2.java class is created.
 <br>
 </p>
 
 <p>
 In Report 1 and Report 2, all you need is a constructor that accepts "CommonSteps" object as below:
 
    private CommonSteps cs;
    
     public SpecificStep1(CommonSteps cs) {
         this.cs = cs;
     } 
 </p>
 
 <p>
 Next Step is, add pico container in pom.xml: <br>
&nbsp;&nbsp; &lt;dependency&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;groupId&gt;io.cucumber&lt;/groupId&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&lt;artifactId&gt;cucumber-picocontainer&lt;/artifactId&gt;<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &lt;version&gt;5.1.2&lt;/version&gt;<br>
&nbsp;&nbsp; &lt;/dependency&gt;<br>
 </p>