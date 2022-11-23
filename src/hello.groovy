//def helloApi(HOST,AUTH_TOKEN,modulebuildId){
def helloApi(HOST,AUTH_TOKEN,modulebuildId){
    //add code for this method
    echo "From hello groovy and ${docker_login} method"
    echo "----$HOST---$AUTH_TOKEN-----$modulebuildId-----${body}"
}
def helloTest(){
    //add code for this method
    //echo "Checking the variables/environ ${environment} with build number ${env.BUILD_NUMBER}, my name ${env.NAME}"
    echo "From hello groovy and ${ENVIRONMENT}-2 method with build number ${env.BUILD_NUMBER}"
    echo "${ENVIRONMENT}----${docker_login}-----${sonar_scanner}"
}
return this
