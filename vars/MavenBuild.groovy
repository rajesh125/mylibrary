def call() {
      sh "mvn clean install -Dmaven.test.skip=true"
      openTasks canComputeNew: false, defaultEncoding: '', excludePattern: '', healthy: '', high: '', low: '', normal: '', pattern: '**/src/*.java', unHealthy: ''
      }
