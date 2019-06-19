using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsForms_railway
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            //
            webBrowser1.Navigate("http://railway.hinet.net/ctkind1.htm");
            button1.Text = "確定";
            label1.Text = "身份證字號:";
            label2.Text = "起站代碼:";
            comboBox1.Items.Add("008");
            comboBox1.Items.Add("009");
            label3.Text = "到站代碼:";
            comboBox2.Items.Add("069");
            comboBox2.Items.Add("070");
            //..
            label4.Text = "乘車日期:";
            comboBox3.Items.Add("2017/06/13-01");
            comboBox3.Items.Add("2017/06/14-02");
            label5.Text = "訂票張數:";
            comboBox4.Enabled = false;
            label6.Text = "車種:";
            comboBox5.Items.Add("*1");
            comboBox5.Items.Add("*2");
            label7.Text = "起始時間:";
            comboBox6.Enabled = false;
            label8.Text = "截止時間:";
            comboBox7.Enabled = false;
            //..
        }

        private void button1_Click(object sender, EventArgs e)
        {
            webBrowser1.Document.GetElementById("person_id").SetAttribute("value", textBox1.Text);
            webBrowser1.Document.GetElementById("from_station").SetAttribute("value", comboBox1.Text);
            webBrowser1.Document.GetElementById("to_station").SetAttribute("value", comboBox2.Text);
            webBrowser1.Document.GetElementById("getin_date").SetAttribute("value", comboBox3.Text);
            
            webBrowser1.Document.GetElementById("train_type").SetAttribute("value", comboBox5.Text);
            
            //...

            //webBrowser1.Document.GetElementById("submit").InvokeMember("click");
        }
    }
}
