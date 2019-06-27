node{
//get Maven home path
def mvnHome = tool name: 'Maven', type: 'maven'
stage('SCM Checkout'){
git 'https://github.com/mnsuryasandeep/SandeepCBDTTask.git'
}
stage('Compile'){
sh "${mvnHome}/bin/mvn compile"
}
stage('Package'){
sh "${mvnHome}/bin/mvn package"
}
}
