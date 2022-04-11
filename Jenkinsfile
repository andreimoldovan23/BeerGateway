node{
    stage('Git Checkout'){
        git branch: 'main', credentialsId: 'git-private-key', poll: false, url: 'git@github.com:andreimoldovan23/BeerGateway.git'
    }

    stage('Build Project'){
        sh 'mvn clean package'
    }

    stage('Deploy Project'){
        sh 'mvn tomcat7:deploy'
    }
}