def call (string path) {
      
      junit "${path}"
      
    // junit allowEmptyResults: true, testResults: '**/test-results/*.xml'

    //sh "mvn test"
}
