def call(String project,String hubuser,String ImageTag){
    sh """
    docker image build -t $(hubuser)/$(project) .
    docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}
    docker image tag ${hubuser}/${project} ${hubuser}/${project}:latest

    """
}


def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker build -t ${ecr_repoName} .
     docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}