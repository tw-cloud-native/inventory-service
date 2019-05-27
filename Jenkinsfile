node{
    stage('Checkout') {
        checkout scm
    }

    stage('Test') {
        sh 'ls -la'
    }

    withEnv([
        'SERVICE=inventory-service',
    ]){
        stage('Build') {
            sh './build.sh'
        }
    }

    withEnv([
        'SERVICE=inventory-service',
        'PROFILES=dev'
    ]){
        stage('Deploy') {
          sh './deploy.sh'
        }
    }


}
