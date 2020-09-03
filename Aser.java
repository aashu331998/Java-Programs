import static java.lang.System.out;
class StLogic
{
int var;
void set(int var)
{
this.var=var;
show();
}
void show()
{
var=var*100;
assert (var==1000):"bug found!!!";
out.println(var);
}

}
class StConcept
{
static public void main (String...arg)
{
StLogic st =new StLogic();
st.set(1);
}
}