def call(Map stageparam){
    checkout{
        $class: 'GitSCM',
        branches: [[name: stageparam.branch]],
        userRemoteConfigs: [[url: stageparam.url]]
    }
}