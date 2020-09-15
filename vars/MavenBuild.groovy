def call() {
      sh "mvn clean install -Dmaven.test.skip=true"
      }
