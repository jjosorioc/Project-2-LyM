// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/project2.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class project2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=16;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=17;
      Object coder=$fix(project2.createCoder());
      $line=18;
      Object deCoder=$fix(project2.createDecoder());
      $line=25;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=35;
      Object sigma=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet("null")));
      $line=36;
      Object mod3=$fix(GCollections.asSet(0,1,2));
      $line=37;
      Object mod5=$fix(GCollections.asSet(0,1,2,3,4));
      $line=40;
      Object Q=$fix($opCartsY(new Object[]{sigma,sigma,sigma,mod3,mod5}));
      $line=41;
      Object estados=$fix($opUnionY(Q,GCollections.asSet("fin")));
      $line=43;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','$')));
      $line=44;
      Object \u03A3_=$fix($opUnionY($opUnionY($opUnionY(\u03A3,GCollections.asSet('#')),GCollections.asSet('0','1','2','3','4')),$opIntvlY('A','Z')));
      $line=45;
      Object q_0=$fix(GCollections.asList("null","null","null",1,0));
      $line=46;
      Object F=$fix(GCollections.asSet("fin"));
      $line=48;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{estados,\u03A3,\u03A3_,q_0,F,new GMethod(project2.class,"\u03B4"),new GMethod(project2.class,"g"),new GMethod(project2.class,"h")});
      if (true) break $try;
      $line=49;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=54;
      $result="fin";
      if (true) break $try;
      $line=55;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object sigma=$v2.next();
      Object alpha=$v2.next();
      Object anterior=$v2.next();
      Object indice=$v2.next();
      Object replacements=$v2.next();
      $line=61;
      Object nuevoReplacements=$fix(replacements);
      $line=62;
      if ($opMembrY(input,GCollections.asSet(sigma,alpha))) {
        $line=62;
        nuevoReplacements=$fix($opModulY($opAdditY(nuevoReplacements,1),5));
      }
      $line=66;
      if ($opEqualY(input,'$')) {
        $line=66;
        $result="fin";
        if (true) break $try;
      }
      else {
        $line=68;
        if ($opEqualY(input,':')) {
          $line=68;
          $result=GCollections.asList(sigma,alpha,anterior,indice,replacements);
          if (true) break $try;
        }
      }
      $line=74;
      if ($opEqualY(sigma,"null")) {
        $line=74;
        $result=GCollections.asList(input,"null","null",1,0);
        if (true) break $try;
      }
      else {
        $line=77;
        if (($opMembrY(sigma,$opIntvlY('a','z'))&&$opEqualY(alpha,"null"))) {
          $line=77;
          $result=GCollections.asList(sigma,input,"null",1,0);
          if (true) break $try;
        }
      }
      $line=82;
      if (($opEqualY(anterior,"null")&&$opEqualY(indice,"null"))) {
        $line=82;
        $result=GCollections.asList(sigma,alpha,input,$opModulY($opAdditY($opSubtrY(indice,'0'),1),3),nuevoReplacements);
        if (true) break $try;
      }
      $line=86;
      if ($opEqualY(input,'$')) {
        $line=86;
        $result="fin";
        if (true) break $try;
      }
      $line=89;
      $result=GCollections.asList(sigma,alpha,input,$opModulY($opAdditY($opSubtrY(indice,'0'),1),3),nuevoReplacements);
      if (true) break $try;
      $line=90;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8sigma,alpha,anterior,indice,replacements\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=97;
      $result="";
      if (true) break $try;
      $line=98;
      $rethrow(new RuntimeException("The function \"h(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"h",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object sigma=$v4.next();
      Object alpha=$v4.next();
      Object anterior=$v4.next();
      Object indice=$v4.next();
      Object replacements=$v4.next();
      $line=103;
      if ($opEqualY(input,'$')) {
        $line=104;
        if ($opEqualY(replacements,0)) {
          $line=104;
          $result='0';
          if (true) break $try;
        }
        else {
          $line=105;
          if ($opEqualY(replacements,1)) {
            $line=105;
            $result='1';
            if (true) break $try;
          }
          else {
            $line=106;
            if ($opEqualY(replacements,2)) {
              $line=106;
              $result='2';
              if (true) break $try;
            }
            else {
              $line=107;
              if ($opEqualY(replacements,3)) {
                $line=107;
                $result='3';
                if (true) break $try;
              }
              else {
                $line=108;
                if ($opEqualY(replacements,4)) {
                  $line=108;
                  $result='4';
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      else {
        $line=111;
        if ($opEqualY(input,':')) {
          $line=111;
          $result=':';
          if (true) break $try;
        }
      }
      $line=115;
      if (($opEqualY(input,sigma)&&!$opEqualY(alpha,"null"))) {
        $line=115;
        $result=alpha;
        if (true) break $try;
      }
      else {
        $line=117;
        if (($opEqualY(input,alpha)&&!$opEqualY(sigma,"null"))) {
          $line=117;
          $result=sigma;
          if (true) break $try;
        }
        else {
          $line=119;
          if (((!$opMembrY(input,GCollections.asSet(sigma,alpha))&&!$opEqualY(alpha,"null"))&&!$opEqualY(sigma,"null"))) {
            $line=120;
            if ($opEqualY(anterior,input)) {
              $line=120;
              $result='#';
              if (true) break $try;
            }
            else {
              $line=123;
              if ((!$opEqualY(input,anterior)&&$opEqualY(indice,1))) {
                $line=123;
                $result=project2.upperShift(input,1);
                if (true) break $try;
              }
              else {
                $line=126;
                if ((!$opEqualY(input,anterior)&&$opEqualY(indice,2))) {
                  $line=126;
                  $result=project2.upperShift(input,0);
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=135;
      $result=input;
      if (true) break $try;
      $line=136;
      $rethrow(new RuntimeException("The function \"h(\u27E8sigma,alpha,anterior,indice,replacements\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=142;
      $result="";
      if (true) break $try;
      $line=143;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"g",$line);
    }
    return $result;
  }
  public static Object upperShift(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=147;
      Object newSymbol=$fix(0);
      $line=149;
      if (($opEqualY(shift,0)&&!$opEqualY(symbol,'z'))) {
        $line=149;
        newSymbol=$fix($opSubtrY(symbol,32));
      }
      else {
        $line=150;
        if (!$opEqualY(symbol,'z')) {
          $line=151;
          newSymbol=$fix($opSubtrY($opAdditY(symbol,shift),32));
        }
        else {
          $line=152;
          if (($opEqualY(symbol,'z')&&$opEqualY(shift,0))) {
            $line=153;
            newSymbol=$fix(90);
          }
          else {
            $line=155;
            $result='A';
            if (true) break $try;
          }
        }
      }
      $line=158;
      char[] toCharResult=$cast(char[].class,$fix(Character.toChars($int(newSymbol))));
      $line=159;
      $result=((char[])toCharResult)[$int(0)];
      if (true) break $try;
      $line=160;
      $rethrow(new RuntimeException("The function \"upperShift(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"upperShift",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=168;
      Object sigma=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet("null")));
      $line=169;
      Object mod3=$fix(GCollections.asSet(0,1,2));
      $line=170;
      Object mod5=$fix(GCollections.asSet(0,1,2,3,4));
      $line=173;
      Object Q=$fix($opCartsY(new Object[]{sigma,sigma,sigma,mod3}));
      $line=174;
      Object estados=$fix($opUnionY(Q,GCollections.asSet("fin")));
      $line=176;
      Object \u03A3=$fix($opUnionY($opUnionY($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','#')),GCollections.asSet('0','1','2','3','4')),$opIntvlY('A','Z')));
      $line=177;
      Object \u03A3_=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','$')));
      $line=178;
      Object q_0=$fix(GCollections.asList("null","null","null",1));
      $line=179;
      Object F=$fix(GCollections.asSet("fin"));
      $line=181;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{estados,\u03A3,\u03A3_,q_0,F,new GMethod(project2.class,"\u03B41"),new GMethod(project2.class,"g"),new GMethod(project2.class,"h1")});
      if (true) break $try;
      $line=182;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object estado, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=185;
      $result="fin";
      if (true) break $try;
      $line=186;
      $rethrow(new RuntimeException("The function \"\u03B41(estado:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v5, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object sigma=$v6.next();
      Object alpha=$v6.next();
      Object anterior=$v6.next();
      Object indice=$v6.next();
      $line=192;
      if ($opEqualY(input,':')) {
        $line=192;
        $result=GCollections.asList(sigma,alpha,anterior,indice);
        if (true) break $try;
      }
      else {
        $line=194;
        if ($opMembrY(input,GCollections.asSet('0','1','2','3','4'))) {
          $line=194;
          $result="fin";
          if (true) break $try;
        }
      }
      $line=199;
      if ($opEqualY(input,'#')) {
        $line=199;
        $result=GCollections.asList(sigma,alpha,anterior,$opModulY($opAdditY(indice,1),3));
        if (true) break $try;
      }
      $line=204;
      if (((($opEqualY(sigma,"null")&&$opEqualY(alpha,"null"))&&$opEqualY(anterior,"null"))&&$opMembrY(input,$opIntvlY('a','z')))) {
        $line=204;
        $result=GCollections.asList(input,"null","null",1);
        if (true) break $try;
      }
      $line=207;
      if (((($opMembrY(sigma,$opIntvlY('a','z'))&&$opEqualY(alpha,"null"))&&$opEqualY(anterior,"null"))&&$opMembrY(input,$opIntvlY('a','z')))) {
        $line=207;
        $result=GCollections.asList(sigma,input,"null",1);
        if (true) break $try;
      }
      $line=211;
      if ($opMembrY(input,GCollections.asSet(sigma,alpha))) {
        $line=213;
        if ($opEqualY(input,sigma)) {
          $line=213;
          $result=GCollections.asList(sigma,alpha,alpha,$opModulY($opAdditY(indice,1),3));
          if (true) break $try;
        }
        else {
          $line=215;
          if ($opEqualY(input,alpha)) {
            $line=215;
            $result=GCollections.asList(sigma,alpha,sigma,$opModulY($opAdditY(indice,1),3));
            if (true) break $try;
          }
        }
      }
      $line=224;
      if (((($opGreaqY($opSubtrY(input,0),65)&&$opLessqY($opSubtrY(input,0),90))&&!$opEqualY(sigma,"null"))&&!$opEqualY(alpha,"null"))) {
        $line=226;
        if ($opEqualY(indice,1)) {
          $line=226;
          $result=GCollections.asList(sigma,alpha,project2.minusculaAnterior(input),$opModulY($opAdditY(indice,1),3));
          if (true) break $try;
        }
        else {
          $line=228;
          if ($opEqualY(indice,2)) {
            $line=228;
            $result=GCollections.asList(sigma,alpha,project2.minusculaMisma(input),$opModulY($opAdditY(indice,1),3));
            if (true) break $try;
          }
        }
      }
      $line=234;
      if (($opGreaqY($opSubtrY(input,0),65)&&$opLessqY($opSubtrY(input,0),90))) {
        $line=235;
        $result=GCollections.asList(sigma,alpha,anterior,indice);
        if (true) break $try;
      }
      $line=240;
      $result=GCollections.asList(sigma,alpha,input,$opModulY($opAdditY(indice,1),3));
      if (true) break $try;
      $line=241;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8sigma,alpha,anterior,indice\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object estado, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=245;
      $result="";
      if (true) break $try;
      $line=246;
      $rethrow(new RuntimeException("The function \"h1(estado:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v7, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v8=GCollections.unmodifiableCollection($v7).iterator();
      Object sigma=$v8.next();
      Object alpha=$v8.next();
      Object anterior=$v8.next();
      Object indice=$v8.next();
      $line=251;
      if ($opMembrY(input,$opIntvlY('0','4'))) {
        $line=251;
        $result='$';
        if (true) break $try;
      }
      $line=253;
      if ($opEqualY(input,'#')) {
        $line=253;
        $result=anterior;
        if (true) break $try;
      }
      else {
        $line=255;
        if ($opEqualY(input,':')) {
          $line=255;
          $result=input;
          if (true) break $try;
        }
      }
      $line=261;
      if (($opEqualY(input,sigma)&&!$opEqualY(alpha,"null"))) {
        $line=261;
        $result=alpha;
        if (true) break $try;
      }
      else {
        $line=263;
        if (($opEqualY(input,alpha)&&!$opEqualY(sigma,"null"))) {
          $line=263;
          $result=sigma;
          if (true) break $try;
        }
      }
      $line=268;
      if (((($opGreaqY($opSubtrY(input,0),65)&&$opLessqY($opSubtrY(input,0),90))&&!$opEqualY(sigma,"null"))&&!$opEqualY(alpha,"null"))) {
        $line=270;
        if ($opEqualY(indice,1)) {
          $line=270;
          $result=project2.minusculaAnterior(input);
          if (true) break $try;
        }
        else {
          $line=272;
          if ($opEqualY(indice,2)) {
            $line=272;
            $result=project2.minusculaMisma(input);
            if (true) break $try;
          }
          else {
            $line=274;
            $result="";
            if (true) break $try;
          }
        }
      }
      else {
        $line=278;
        if (($opGreaqY($opSubtrY(input,0),65)&&$opLessqY($opSubtrY(input,0),90))) {
          $line=278;
          $result="";
          if (true) break $try;
        }
      }
      $line=283;
      if (($opEqualY(sigma,"null")&&$opEqualY(alpha,"null"))) {
        $line=283;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=285;
        if ((!$opEqualY(sigma,"null")&&$opEqualY(alpha,"null"))) {
          $line=285;
          $result=input;
          if (true) break $try;
        }
      }
      $line=290;
      $result=input;
      if (true) break $try;
      $line=291;
      $rethrow(new RuntimeException("The function \"h1(\u27E8sigma,alpha,anterior,indice\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"h1",$line);
    }
    return $result;
  }
  public static Object minusculaMisma(Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=298;
      Object newSymbol=$fix($opSubtrY(input,0));
      $line=299;
      newSymbol=$fix($opAdditY(newSymbol,32));
      $line=300;
      char[] toCharResult=$cast(char[].class,$fix(Character.toChars($int(newSymbol))));
      $line=301;
      $result=((char[])toCharResult)[$int(0)];
      if (true) break $try;
      $line=302;
      $rethrow(new RuntimeException("The function \"minusculaMisma(input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"minusculaMisma",$line);
    }
    return $result;
  }
  public static Object minusculaAnterior(Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=306;
      if ($opEqualY(input,'A')) {
        $line=307;
        $result='z';
        if (true) break $try;
      }
      else {
        $line=309;
        Object newSymbol=$fix($opSubtrY(input,0));
        $line=310;
        newSymbol=$fix($opAdditY(newSymbol,31));
        $line=311;
        char[] toCharResult=$cast(char[].class,$fix(Character.toChars($int(newSymbol))));
        $line=312;
        $result=((char[])toCharResult)[$int(0)];
        if (true) break $try;
      }
      $line=314;
      $rethrow(new RuntimeException("The function \"minusculaAnterior(input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,project2.class,"minusculaAnterior",$line);
    }
    return $result;
  }
}
