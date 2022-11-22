package k8s.deploy
import groovy.transform.Field

@Field private helloModule = null
@Field private firstModule = null


def init(){
    def current_path =sh(script: "pwd", returnStdout: true).trim()
    
    def hello_version = "hello"
    def first_version = "first"    
    
    helloModule = load ("${current_path}/API/PublisherAPI/${hello_version}.groovy")
    firstModule = load ("${current_path}/API/PublisherAPI/${first_version}.groovy")
    
}

def testHello(){
        //add code for this method
        helloModule.helloTest()
        echo "This is from second groovy and helloTest method from hello.groovy" 
        }
def testfirst(){
        //add code for this method
        firstModule.firstTest2()
        echo "This is from second groovy and firstTest method from first.groovy" 
        }
def HelloModuleBuild(env,moduleBuildId,body,HOST,AUTH_TOKEN){
    //stage("test"){
    echo "Here iam $env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("./constants.groovy")
        
    helloModule.helloApi("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
    echo "This is from second groovy and test-2 method"
      //  } 
def firstModuleBuild(env,moduleBuildId,body,HOST,AUTH_TOKEN){
    //stage("test"){
    echo "Here iam $env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("./constants.groovy")
        
    firstModule.firstApi("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
    echo "This is from second groovy with firstModuleBuild method and firstApi method from first.groovy"
      //  }     
    }
return this    

