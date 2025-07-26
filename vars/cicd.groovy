def Gitdownload(repo)
{
  git branch: 'main', url: "https://github.com/devgain007/${repo}.git"
}
def buildArtifact() 
{
  sh 'python3 prac.py'
}
