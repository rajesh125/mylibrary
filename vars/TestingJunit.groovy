def call () {
      
      junit "${path}"
      
    // junit allowEmptyResults: true, testResults: '**/test-results/*.xml'

    //sh "mvn test"
}
