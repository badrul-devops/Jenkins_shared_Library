def call(String project,String hubuser,String ImageTag){
    sh """
    trivy image ${hubuser}/${project}:latest > sacn.txt
    cat sacn.txt
    """
}