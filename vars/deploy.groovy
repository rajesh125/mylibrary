def call(String hubuser, String repo, String repotag) {
    echo " Login Successfull"
    sh "docker pull ${hubuser}/${repo}:${repotag}-v${env.BUILD_NUMBER}"
    sh "docker run -d ${hubuser}/${repo}:${repotag}-v${env.BUILD_NUMBER}"  
}
