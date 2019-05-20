node{
    stage('Checkout') {
        git url: 'https://github.com/tw-cloud-native/inventory-service.git',
            branch: 'master'
    }

    stage('Test') {
        sh 'ls -la'
    }

    withEnv([
        'ECR_HOST=076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn',
        'TEAM=team-a',
        'SERVICE=inventory-service'
    ]){
        stage('Build') {
            sh './build.sh'
        }

        stage('Deploy') {
            // withCredentials([file(credentialsId: 'KUBE_CONFIG', variable: 'KUBE_CONFIG')]) {
                sh './deploy.sh'
            //}
        }
    }


}