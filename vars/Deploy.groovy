def call(String hubuser, String repo) {
    sh "docker pull ${hubuser}/${repo}:v${env.BUILD_NUMBER}"
    sh "docker run -d -p 8080:8080 ${hubuser}/${repo}:v${env.BUILD_NUMBER}"  
}
