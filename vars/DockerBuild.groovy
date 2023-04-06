def call(String project,String hubuser,String ImageTag){
    sh """
    docker image build -t $(hubuser)/$(project) .
    docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}
    docker image tag ${hubuser}/${project} ${hubuser}/${project}:latest

    """
}