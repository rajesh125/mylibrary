def call (String path) {
      
      junit "${path}"
      
    // junit allowEmptyResults: true, testResults: '**/test-results/*.xml'

    //sh "mvn test"
}
