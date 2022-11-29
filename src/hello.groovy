//def helloApi(HOST,AUTH_TOKEN,modulebuildId){
def helloApi(bodies){
    //add code for this method
    echo "From hello groovy and ${docker_login} method"
    echo "----${Host}---${AUTH_TOKEN}-----${modulebuildId}-----${body}---${myName}"
    echo "$bodies"
    //value1 = $bodies
    if ($bodies == 'hello') {
        echo 'Hello from main branch'
        }
    else {
        sh "echo 'Hello from ${env.BRANCH_NAME} branch!'"
        }
}
def helloTest(){
    //add code for this method
    //echo "Checking the variables/environ ${environment} with build number ${env.BUILD_NUMBER}, my name ${env.NAME}"
    echo "From hello groovy and ${ENVIRONMENT}-2 method with build number ${env.BUILD_NUMBER}"
    echo "${ENVIRONMENT}----${docker_login}-----${sonar_scanner}"
}
return this
