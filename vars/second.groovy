package k8s.deploy
import groovy.transform.Field

@Field private helloModule = null
@Field private firstModule = null

version_api_modulebuild = "src"

def init(){
    //def current_path =sh(script: "pwd", returnStdout: true).trim()
    
    def hello_version = "hello"
    def first_version = "first"    
    
    helloModule = load ("${env.WORKSPACE}/src/${hello_version}.groovy")
    firstModule = load ("${env.WORKSPACE}/src/${first_version}.groovy")
}

def helloMod(){
    //add code for this method
    helloModule.helloTest()
    echo "This is from second groovy and helloTest method from hello.groovy" 
}
def firstMod(){
    //add code for this method
    firstModule.firstTest2()
    echo "This is from second groovy and firstTest method from first.groovy" 
}
//def helloModuleBuild(env,moduleBuildId,HOST,AUTH_TOKEN){
  def helloModuleBuild(bodies){
    
    //stage("test"){
   // echo "Here iam from helloModuleBuild ---$env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("./constants.groovy")
        
//    helloModule.helloApi("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
    helloModule.helloApi("$bodies")
    echo "This is from second groovy and test-2 method"
      //  } 
}
def firstModuleBuild(env,moduleBuildId,body,HOST,AUTH_TOKEN){
    //stage("test"){
    echo "Here iam from firstModuleBuild ---$env---$moduleBuildId---$body----$version_api_modulebuild"
        //def var = load ("./constants.groovy")
        
    firstModule.firstApi("$HOST","$AUTH_TOKEN","$moduleBuildId","$body")
    echo "This is from second groovy with firstModuleBuild method and firstApi method from first.groovy"
      //  }     
    }
return this    

