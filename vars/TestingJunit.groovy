def call (string testpath) {
      
      junit "${testpath}"
      
    // junit allowEmptyResults: true, testResults: '**/test-results/*.xml'

    //sh "mvn test"
}
