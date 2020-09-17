def call(String hubuser, String repo) {
    echo " Login Successfull"
    sh "docker pull ${hubuser}/${repo}:v${env.BUILD_NUMBER}"
    sh "docker run -d ${hubuser}/${repo}:v${env.BUILD_NUMBER}"  
}
