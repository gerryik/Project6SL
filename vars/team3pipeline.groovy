def call(String repoURL){
  pipeline{
  agent any
  stages{
    stage('project9'){
      parallel{
        stage('Gerald  Agbonye'){
when {
                not {
                    anyOf {
                        branch 'master'; branch 'develop'; branch 'feature'
                    }
                }
          }
          steps{
            sh '/var/lib/jenkins/script/project9grp5q1scrpit.sh'
          }
        }
        stage('Pretei  Lemo'){
when {
                not {
                    anyOf {
                  branch 'master'; branch 'develop'; branch 'feature'
                    }
                }
          }
          steps{
             sh '/var/lib/jenkins/script/lemorscript.sh'
          }
        }
   stage('Odile Domingo'){
when {
                not {
                    anyOf {
                      branch 'master'; branch 'develop'; branch 'feature'
                    }
                }
          }
       steps{
             sh '/var/lib/jenkins/script/odilescript.sh'
        }
    }
  stage('Le Pere'){
when {
                not {
                    anyOf {
                branch 'master'; branch 'develop'; branch 'feature'
                    }
                }
          }
       steps{
            echo "TODO"
        }
    } 
 stage('Henry Forson'){
            when {      
    branch 'feature'
            }
           steps {
               echo "Other members not coming to group meetings"
            }
        }
            stage("Other Members") {
        when {
  
                        branch 'master'; branch 'develop'; branch 'feature'
 
                }
 
        steps{
                echo "TODO"
        }
     }
    }
   }
  }
}
}
