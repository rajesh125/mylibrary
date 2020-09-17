def call(String hubuser, String repo, String repotag) {

    sh "docker pull $(hubuser)/${repo}:${repotag}-/"v$BUILD_NUMBER"/"
    sh "docker run -d $(hubuser)/${repo}:${repotag}-/"v$BUILD_NUMBER"/"
}
