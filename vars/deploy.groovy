def call(String hubuser, String repo, String repotag) {

    sh "docker pull $(hubuser)/${repo}:${repotag}-v${env.BUILD_NUMBER}"
    sh "docker run -d -p  $(hubuser)/${repo}:${repotag}-v${env.BUILD_NUMBER}"
}
