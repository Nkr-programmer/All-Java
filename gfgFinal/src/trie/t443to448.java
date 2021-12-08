package trie;

import java.util.*;

public class t443to448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//1
	//trie insert and delete
	//O(key Length)
  static final int ALPHABET_SIZE = 26;
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
       boolean isEndOfWord;
       
        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
        }
    };

    static void insert(TrieNode root, String key) 
{
    TrieNode p=root;
    for(int i=0;i<key.length();i++)
    {int index=key.charAt(i)-'a';
        if(p.children[index]==null)
        {p.children[index]=new TrieNode();}
        p=p.children[index];
    }
p.isEndOfWord=true;
}
    
static boolean search(TrieNode root, String key)
{

    TrieNode p=root;
    for(int i=0;i<key.length();i++)
    {int index=key.charAt(i)-'a';
        if(p.children[index]==null)return false;
        p=p.children[index];
    }
return (p.isEndOfWord);
}
//2
//Find shortest unique prefix for every word in a given list 
//O(n)
static class TrieNodes {
    TrieNodes[] children = new TrieNodes[ALPHABET_SIZE];
 int freq;
    TrieNodes() {
        freq=1;
        for (int i = 0; i < ALPHABET_SIZE; i++) children[i] = null;
    }
};

static void inserts(TrieNodes root, String key) 
{
TrieNodes p=root;
for(int i=0;i<key.length();i++)
{int index=key.charAt(i)-'a';
    if(p.children[index]==null)
    {p.children[index]=new TrieNodes();}
    else {p.freq++;}
    p=p.children[index];
}
}
static void findPrefixesUtil(TrieNodes root, char[] prefix,int ind)
{
if (root == null)return;
if (root.freq == 1)
{
	prefix[ind] = '\0';
    int i = 0;
    while(prefix[i] != '\0')
    System.out.print(prefix[i++]);
    System.out.print("  ");
    return;
}

for (int i=0; i<256; i++)
{
	if (root.children[i] != null)
     {prefix[ind] = (char) i;
     findPrefixesUtil(root.children[i], prefix, ind+1);}
}
}
static void findPrefixes(TrieNodes root, String arr[],int n)
		{   root = new TrieNodes();
    root.freq = 0;
    for (int i = 0; i<n; i++)
        inserts(root,arr[i]);
    char[] prefix = new char[100];
    findPrefixesUtil(root, prefix, 0);
}
//3
// Word Break
//search and insert function is of q1
static boolean wordBreak(String str, TrieNode root)
{
    int size = str.length();
    if (size == 0)
        return true;
    for(int i = 1; i <= size; i++) 
    {
       if (search(root, str.substring(0, i)) && 
            wordBreak(str.substring(i, size), root))
            return true;
    }
    return false;
}
//4
// Print all anagrams
// 1) same to string of 36

//5
//Phone directory 
static class TieNode {
	 HashMap<Character,TieNode> h=new HashMap<Character,TieNode>();   
   boolean isEndOfWord;
   TieNode() {
       isEndOfWord = false;
       for (char i = 'a'; i <= 'z'; i++) h.put(i,null);
   }
};

static TieNode gh;
static void insert(String key) 
{
TieNode root=gh;
for(int i=0;i<key.length();i++)
{
   TieNode next=root.h.get(key.charAt(i));
   if(next==null)
    {next=new TieNode();
   root.h.put(key.charAt(i), next);
   }
   root=next;
if(i==key.length()-1)
root.isEndOfWord=true;
}
}

static ArrayList<ArrayList<String>> displayContacts(int n, 
                                   String contact[], String s)
{  gh=new TieNode();
   ArrayList<ArrayList<String>>ans=new ArrayList<ArrayList<String>>();
   for(int i=0;i<n;i++)insert(contact[i]);
search(s,ans);
return ans;
}

private static void search(String s, ArrayList<ArrayList<String>> ans) {
int n=s.length();
	TieNode root=gh;
String prefix="";
int i=0;
for( i=0;i<n;i++)
{ArrayList<String>a=new ArrayList<String>();
prefix+=s.charAt(i);
char lastc=s.charAt(i);
TieNode r=root.h.get(lastc);
if(r==null) {a.add("0");ans.add(a);break;}
else {display(r,prefix,a);ans.add(a);}
root=r;
}
for(;i<n-1;i++)
{ArrayList<String>a=new ArrayList<String>();a.add("0");ans.add(a);}

}

private static void display(TieNode r, String prefix, ArrayList<String> a) {
if(r.isEndOfWord) {a.add(prefix);}
for(char i='a';i<='z';i++) {
	TieNode x=r.h.get(i);
if(x!=null) {display(x,prefix+i,a);}
}
}
//6
//Unique rows in boolean matrix
//1) easy way
public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
{
   ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
   HashSet<String>x=new HashSet<String>();
   for(int i=0;i<r;i++)
   {String z="";
   ArrayList<Integer>m=new ArrayList<Integer>();
       for(int j=0;j<c;j++)
       {z+=a[i][j];m.add(a[i][j]);}
   if(!x.contains(z)){arr.add(m);}
    x.add(z);
   }
    return arr;
}
//2)

static class TrieNod {
    TrieNod[] children = new TrieNod[2];
 boolean f;
    TrieNod() {
        f=false;
        for (int i = 0; i < 2; i++) children[i] = null;
    }
};

public static ArrayList<ArrayList<Integer>> uniqueRow2(int a[][],int r, int c)
{
	TrieNod root = new TrieNod();
   ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
   for(int i=0;i<r;i++)
   {
	   if(insert(root,a,i))
	   {
		   ArrayList<Integer>t=new ArrayList<Integer>();
		   for(int j=0;j<c;j++)
		   {t.add(a[i][j]);}
			   arr.add(t);
	   }
   }
return arr;
}
private static boolean insert(TrieNod root,int[][] a, int i) {
	boolean flag=false;
	for(int j=0;j<a[0].length;j++)
	{
	int index=a[i][j];
	if(root.children[index]==null) {root.children[index]=new TrieNod();flag=true;}
	root=root.children[index];
	}
	root.f=true;
	return flag;
}

}