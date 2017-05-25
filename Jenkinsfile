node {
   stage 'Checkout'    
   echo 'Hello World'
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'CleanBeforeCheckout']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'c7dda38d-7f6c-4add-af2e-fb597ae57c5a', url: 'git@github.com:rame-ray/gradletst.git']]])
    
   stage 'Build'
   echo 'hello from pipeline'
   sh'/opt/gradle/gradle-3.4.1/bin/gradle clean build'

   stage 'Finished'
   echo 'pipeline executed'
}
