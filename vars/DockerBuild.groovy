def call(String hubuser, String repo) {

    sh "docker login -u '$Username' -p '$Password'"
    sh "docker image build -t ${hubuser}/${repo}:v${env.BUILD_NUMBER} ."
    sh "docker image push ${hubuser}/${repo}:v${env.BUILD_NUMBER}"
    sh "docker image rm ${hubuser}/${repo}:v${env.BUILD_NUMBER}"   
}
