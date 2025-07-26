def Gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/devgain007/${repo}.git"
}
def buildArtifact() 
{
  sh 'python3'
}
def deployment(jobname,ip)
{
  sh """ 
scp -r "/home/ubuntu/${jobname}" ubuntu@${ip}:/home/ubuntu/App
"""
}
