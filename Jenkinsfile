node{
    stage('Checkout') {
        script {
            def url = scm.userRemoteConfigs[0].url
            echo url
        }

        git url: 'https://github.com/tw-cloud-native/inventory-service.git',
            branch: 'master'
    }

    stage('Test') {
        sh 'ls -la'
    }

    stage('Build') {
        sh './build.sh'
    }

    stage('Deploy') {
        // withCredentials([file(credentialsId: 'KUBE_CONFIG', variable: 'KUBE_CONFIG')]) {
            sh './deploy.sh'
        //}
    }
}