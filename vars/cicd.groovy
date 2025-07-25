def gitDownload(repo)
{
  git branch: 'main', url: "https://github.com/devgain007/practice-codes/{repo}.git"
}
