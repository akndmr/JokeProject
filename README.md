<h1 id="gradle-for-android-and-java-final-project">Gradle for Android and Java Final Project</h1>
<p>In this project, you will create an app with multiple flavors that uses multiple libraries and Google Cloud Endpoints. The finished app will consist of four modules. A Java library that provides jokes, a Google Cloud Endpoints (GCE) project that serves those jokes, an Android Library containing an activity for displaying jokes, and an Android app that fetches jokes from the GCE module and passes them to the Android Library for display.</p>
<h2 id="why-this-project">Why this Project</h2>
<p>As Android projects grow in complexity, it becomes necessary to customize the behavior of the Gradle build tool, allowing automation of repetitive tasks. Particularly, factoring functionality into libraries and creating product flavors allow for much bigger projects with minimal added complexity.</p>
<h2 id="what-will-i-learn-">What Will I Learn?</h2>
<p>You will learn the role of Gradle in building Android Apps and how to use Gradle to manage apps of increasing complexity. You'll learn to:</p>
<ul>
<li>Add free and paid flavors to an app, and set up your build to share code between them</li>
<li>Factor reusable functionality into a Java library</li>
<li>Factor reusable Android functionality into an Android library</li>
<li>Configure a multi project build to compile your libraries and app</li>
<li>Use the Gradle App Engine plugin to deploy a backend</li>
<li>Configure an integration test suite that runs against the local App Engine development server</li>
</ul>
<div class="ng-scope">
<p>&nbsp;</p>
<p><strong>Required Components</strong></p>
<table class="table table-bordered section-table">
<thead>
<tr>
<th class="rubric-category meets-specs"><span class="ng-scope" translate="">MEETS SPECIFICATIONS</span></th>
</tr>
</thead>
<tbody>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>Project contains a Java library for supplying jokes.</p>
</td>
</tr>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>Project contains an Android library with an activity that displays jokes passed to it as intent extras.</p>
</td>
</tr>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an&nbsp;<code>AsyncTask</code>.</p>
</td>
</tr>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>Project contains connected tests to verify that the&nbsp;<code>AsyncTask</code>&nbsp;is indeed loading jokes.</p>
</td>
</tr>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>Project contains paid/free flavors. The paid flavor has no ads and no unnecessary dependencies.</p>
<p>Ads are required in the free version.</p>
</td>
</tr>
</tbody>
</table>
</div>
<div class="ng-scope">
<p><strong>Required Behavior</strong></p>
<table class="table table-bordered section-table">
<thead>
<tr>
<th class="rubric-category meets-specs"><span class="ng-scope" translate="">MEETS SPECIFICATIONS</span></th>
</tr>
</thead>
<tbody>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library. Note that the GCE module need only be deployed locally.</p>
</td>
</tr>
<tr class="ng-scope">
<td class="rubric-item ng-binding">
<p>App conforms to common standards found in the&nbsp;<a href="http://udacity.github.io/android-nanodegree-guidelines/core.html" target="_blank" rel="noopener">Android Nanodegree General Project Guidelines</a>.</p>
</td>
</tr>
</tbody>
</table>
<p>&nbsp;</p>
<p>&nbsp;</p>
</div>
