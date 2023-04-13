# Project6SL
convert multi branch project to shared Library with README.md file
To Use This Application
DO the following action.

1. Create a single uubuntu AWS T2 medium insatance Insatnce
2. Update the insance, then install Jenkins,
3. configure the Jenkins server with
4. Then setup the Jenkins shared Library
5. Create a shared library repository in Github using your account
6. Setup github webhook to trigger pull request events  eg> freom feature -> develop -> main
7. Create another repository for the app1, app2, app3 ...ap(n)
8. Create a Jenkinsfile for each of the applications with the @Library call to the groovy file in the shared library 
9. Assign the url of the groovy file created in the shared library to the app in each of the jenkinsfile
10.   
