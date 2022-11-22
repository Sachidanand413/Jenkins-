def firstApi(HOST,AUTH_TOKEN,modulebuildId,body){
    //add code for this method
    echo "From first groovy and test-1 method"
    echo "$HOST----$AUTH_TOKEN-----$modulebuildId-----$body"
}
def firstTest2(){
    //add code for this method
    echo "From first groovy and test-2 method"
    echo "${ENVIRONMENT}----${docker_login}-----${sonar_scanner}"
}
return this
