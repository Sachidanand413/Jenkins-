import groovy.transform.Field
@Field private First = null
version_api_modulebuild= "src"
def version_api_api_deployment=        "src"
def version_api_api_deployment_request="src"
def init(first) {
    First = first
}

def test1(){
        //add code for this method
        First.test2()
        echo "This is from second groovy and test-1 method"
        }
def updateEugeneModuleBuild(env,moduleBuildId,body,HOST,AUTH_TOKEN){
    stage("test"){
        echo "Here iam $env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("./constants.groovy")
        First.api("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
        echo "This is from second groovy and test-2 method"
        } 
    }
return this    

