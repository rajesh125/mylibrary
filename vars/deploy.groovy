def call(String hubuser, String repo, String repotag, port) {

    sh "docker pull $(hubuser)/${repo}:${repotag}-v${env.BUILD_NUMBER}"
    sh "docker run -d -p ${port}:${port} $(hubuser)/${repo}:${repotag}-v${env.BUILD_NUMBER}"
}
