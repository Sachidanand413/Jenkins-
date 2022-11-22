def helloApi(HOST,AUTH_TOKEN,modulebuildId,body){
    //add code for this method
    echo "From hello groovy and test-1 method"
    echo "${Host}----$HOST---$AUTH_TOKEN-----$modulebuildId-----$body"
}
def helloTest(){
    //add code for this method
    echo "From hello groovy and ${ENVIRONMENT}-2 method"
    echo "${ENVIRONMENT}----${docker_login}-----${sonar_scanner}"
}
return this
